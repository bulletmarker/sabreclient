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
import com.itsum.sabre.client.dto.ota.airprice.OTAAirPriceRQ;
import com.itsum.sabre.client.dto.ota.airprice.OTAAirPriceRS;
import com.itsum.sabre.client.dto.ota.airprice.OTA_AirPriceLLSInput;
import com.itsum.sabre.client.dto.ota.airprice.OTA_AirPriceLLSOutput;
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
public class OTA_AirPriceLLSEP implements ISabreEndpoint<OTA_AirPriceLLSInput,OTA_AirPriceLLSOutput>{
	
	public static final String ACTION_CODE = "OTA_AirPriceLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.1.0";
	
	private static OTA_AirPriceLLSEP instance = new OTA_AirPriceLLSEP();
	
	private OTA_AirPriceLLSEP(){
		
	}
	
	public static OTA_AirPriceLLSEP getInstance(){
		return instance;
	}

	public OTA_AirPriceLLSOutput call(SabreConnection conn,OTA_AirPriceLLSInput input) throws SabreClientException{
		conn.prepare();
		OTA_AirPriceLLSOutput output = new OTA_AirPriceLLSOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, OTA_AirPriceLLSInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, OTA_AirPriceLLSInput input) throws BuildMessageException {
		OTAAirPriceRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setTimeStamp(SabreUtil.getXMLGregorianCalendarTimestamp());
		//用Document对象创建调用报文
		return JAXBHelper.marshall(rq);
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,OTA_AirPriceLLSOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,OTA_AirPriceLLSOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		OTAAirPriceRS oTAAirPriceRS =  (OTAAirPriceRS) JAXBHelper.unmarshall(OTAAirPriceRS.class, doc);
		ApplicationResults applicationResults = oTAAirPriceRS.getApplicationResults();
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
		output.setRs(oTAAirPriceRS);
	}
	
}
