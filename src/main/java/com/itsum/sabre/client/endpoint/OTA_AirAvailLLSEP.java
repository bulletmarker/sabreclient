package com.itsum.sabre.client.endpoint;

import java.io.InputStream;
import java.util.List;

import javax.xml.soap.SOAPMessage;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ISabreRS;
import com.itsum.sabre.client.dto.common.ApplicationResults;
import com.itsum.sabre.client.dto.common.CompletionCodes;
import com.itsum.sabre.client.dto.common.ProblemInformation;
import com.itsum.sabre.client.dto.common.SystemSpecificResults;
import com.itsum.sabre.client.dto.ota.airavail.OTAAirAvailRQ;
import com.itsum.sabre.client.dto.ota.airavail.OTAAirAvailRS;
import com.itsum.sabre.client.dto.ota.airavail.OTA_AirAvailLLSInput;
import com.itsum.sabre.client.dto.ota.airavail.OTA_AirAvailLLSOutput;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.jaxb.JAXBHelper;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;
import com.itsum.sabre.client.util.SabreUtil;

/**
 * 调用航班信息查询服务OTA_AirAvailLLS封装类
 * @author Jason.Ma
 */
public class OTA_AirAvailLLSEP implements ISabreEndpoint<OTA_AirAvailLLSInput,OTA_AirAvailLLSOutput>{
	
	public static final String ACTION_CODE = "OTA_AirAvailLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.0.0";
	
	private static OTA_AirAvailLLSEP instance = new OTA_AirAvailLLSEP();
	
	private OTA_AirAvailLLSEP(){
		
	}
	
	public static OTA_AirAvailLLSEP getInstance(){
		return instance;
	}

	public OTA_AirAvailLLSOutput call(SabreConnection conn,OTA_AirAvailLLSInput input) throws SabreClientException{
		conn.prepare();
		OTA_AirAvailLLSOutput output = new OTA_AirAvailLLSOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, OTA_AirAvailLLSInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, OTA_AirAvailLLSInput input) throws BuildMessageException {
		OTAAirAvailRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setTimeStamp(SabreUtil.getXMLGregorianCalendarTimestamp());
		//用Document对象创建调用报文
		return JAXBHelper.marshall(rq);
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,OTA_AirAvailLLSOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,OTA_AirAvailLLSOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		OTAAirAvailRS oTAAirAvailRS =  (OTAAirAvailRS) JAXBHelper.unmarshall(OTAAirAvailRS.class, doc);
		ApplicationResults applicationResults = oTAAirAvailRS.getApplicationResults();
		if(CompletionCodes.COMPLETE.equals(applicationResults.getStatus()) && (applicationResults.getError() == null || applicationResults.getError().size() == 0)){
			output.setSuccess(true);
		}else{
			output.setErrorType(ISabreRS.ERRORTYPE_PAYLOAD);
			output.setSuccess(false);
			ProblemInformation error = applicationResults.getError().get(0);
			output.setErrorCode(applicationResults.getStatus().toString());
			List<SystemSpecificResults> sr = error.getSystemSpecificResults();
			if(sr != null && sr.size() > 0){
				SystemSpecificResults s = sr.get(0);
				output.setErrorMessage(s.getShortText());
				output.setSeverity(s.toString());
				output.setErrorInfo((s.getMessage()!=null && s.getMessage().size() > 0) ? error.getSystemSpecificResults().get(0).getMessage().get(0).getValue():null);
			}else{
				output.setErrorMessage("请查看返回报文");
			}
		}
		output.setRs(oTAAirAvailRS);
	}
	
}
