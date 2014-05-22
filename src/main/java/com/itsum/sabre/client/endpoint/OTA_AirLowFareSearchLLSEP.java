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
import com.itsum.sabre.client.dto.ota.airlowfare.OTA_AirLowFareSearchInput;
import com.itsum.sabre.client.dto.ota.airlowfare.OTA_AirLowFareSearchOutput;
import com.itsum.sabre.client.dto.ota.airlowfare.OTAAirLowFareSearchRQ;
import com.itsum.sabre.client.dto.ota.airlowfare.OTAAirLowFareSearchRS;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.jaxb.JAXBHelper;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;
import com.itsum.sabre.client.util.SabreUtil;

/**
* 
* @ClassName: OTA_AirLowFareSearchLLSEP
* @Description: 调用航班信息查询服务OTA_AirLowFareSearchLLS封装类,用来为指定的路线搜索最低可能的价格。这项服务将返回到默认的19行程
* @author Jason.ma
* @date 2014年5月21日 上午9:55:54
*
 */
public class OTA_AirLowFareSearchLLSEP implements ISabreEndpoint<OTA_AirLowFareSearchInput,OTA_AirLowFareSearchOutput>{
	
	public static final String ACTION_CODE = "OTA_AirLowFareSearchLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.3.0";
	
	private static OTA_AirLowFareSearchLLSEP instance = new OTA_AirLowFareSearchLLSEP();
	
	private OTA_AirLowFareSearchLLSEP(){
		
	}
	
	public static OTA_AirLowFareSearchLLSEP getInstance(){
		return instance;
	}

	public OTA_AirLowFareSearchOutput call(SabreConnection conn,OTA_AirLowFareSearchInput input) throws SabreClientException{
		conn.prepare();
		OTA_AirLowFareSearchOutput output = new OTA_AirLowFareSearchOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, OTA_AirLowFareSearchInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, OTA_AirLowFareSearchInput input) throws BuildMessageException {
		OTAAirLowFareSearchRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setTimeStamp(SabreUtil.getXMLGregorianCalendarTimestamp());
		//用Document对象创建调用报文
		return JAXBHelper.marshall(rq);
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,OTA_AirLowFareSearchOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,OTA_AirLowFareSearchOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		OTAAirLowFareSearchRS oTAAirAvailRS =  (OTAAirLowFareSearchRS) JAXBHelper.unmarshall(OTAAirLowFareSearchRS.class, doc);
		ApplicationResults applicationResults = oTAAirAvailRS.getApplicationResults();
		if(CompletionCodes.COMPLETE.equals(applicationResults.getStatus()) && (applicationResults.getError() == null || applicationResults.getError().size() == 0)){
			output.setSuccess(true);
		}else{
			output.setErrorType(ISabreRS.ERRORTYPE_PAYLOAD);
			output.setSuccess(false);
			ProblemInformation error = applicationResults.getError().get(0);
			output.setErrorCode(applicationResults.getStatus().toString());
			List<SystemSpecificResults> sr = error.getSystemSpecificResults();
			StringBuilder errormessage = new StringBuilder();
			errormessage.append("type=").append(error.getType()).append(",TimeStamp=").append(error.getTimeStamp());
			if(sr != null && sr.size() > 0){
				SystemSpecificResults s = sr.get(0);
				errormessage.append(",ShortText=").append(s.getShortText());
				output.setSeverity(null);
				output.setErrorInfo((s.getMessage()!=null && s.getMessage().size() > 0) ? error.getSystemSpecificResults().get(0).getMessage().get(0).getValue():null);
				errormessage.append("Error.message:").append(output.getErrorInfo());
				output.setErrorMessage(errormessage.toString());
			}else{
				output.setErrorMessage("请查看返回报文");
			}
		}
		output.setRs(oTAAirAvailRS);
	}
	
}
