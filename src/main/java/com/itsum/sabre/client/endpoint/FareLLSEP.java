package com.itsum.sabre.client.endpoint;

import java.io.InputStream;

import javax.xml.soap.SOAPMessage;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ISabreRS;
import com.itsum.sabre.client.dto.fare.FareLLSInput;
import com.itsum.sabre.client.dto.fare.FareLLSOutput;
import com.itsum.sabre.client.dto.fare.FareRQ;
import com.itsum.sabre.client.dto.fare.FareRS;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.jaxb.JAXBHelper;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;
import com.itsum.sabre.client.util.SabreUtil;

/**
 * 调用SessionCreateRQ服务封装类
 * @author Jason.Ma
 */
public class FareLLSEP implements ISabreEndpoint<FareLLSInput,FareLLSOutput>{
	
	public static final String ACTION_CODE = "FareLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "1.10.1";
	
	private static FareLLSEP instance = new FareLLSEP();
	
	private FareLLSEP(){
		
	}
	
	public static FareLLSEP getInstance(){
		return instance;
	}

	public FareLLSOutput call(SabreConnection conn,FareLLSInput input) throws SabreClientException{
		conn.prepare();
		FareLLSOutput output = new FareLLSOutput();
		//生成业务报文
		SOAPMessage message = createMessage(conn,input);
		String payload = createPayload(conn,input);
		SabreSOAPHelper.setPayloadPart(message, payload, ACTION_CODE_RQ);
		//发送报文
		SOAPMessage receive = EndpointHelper.sendMessage(message, conn);
		
		parseMessage(receive, conn, output);
		parsePayload(receive, conn, output);
		return output;
	}
	
	@Override
	public SOAPMessage createMessage(SabreConnection conn, FareLLSInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, FareLLSInput input) throws BuildMessageException {
		FareRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setTimeStamp(SabreUtil.getTimestamp());
		rq.setTarget(SystemConfig.getProperty("sabre.ws.client.target"));
		FareRQ.POS pos = new FareRQ.POS();
		FareRQ.POS.Source source = new FareRQ.POS.Source();
		source.setPseudoCityCode(conn.getCpaId());
		pos.setSource(source);
		rq.setPOS(pos);
		return JAXBHelper.marshall(rq);
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,FareLLSOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,FareLLSOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		FareRS fareRS =  (FareRS) JAXBHelper.unmarshall(FareRS.class, doc);
		if(fareRS.getSuccess() != null){
			output.setSuccess(true);
		}else{
			output.setErrorType(ISabreRS.ERRORTYPE_PAYLOAD);
			output.setSuccess(false);
			FareRS.Errors.Error error = fareRS.getErrors().getError();
			output.setErrorCode(error.getErrorCode());
			output.setErrorMessage(error.getErrorMessage());
			output.setSeverity(error.getSeverity());
			output.setErrorInfo(error.getErrorInfo() != null?error.getErrorInfo().getMessage():null);
		}
		output.setRs(fareRS);
	}
	
}
