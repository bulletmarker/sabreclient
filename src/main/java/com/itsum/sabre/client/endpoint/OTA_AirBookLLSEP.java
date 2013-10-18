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
import com.itsum.sabre.client.dto.ota.airbook.OTAAirBookRQ;
import com.itsum.sabre.client.dto.ota.airbook.OTAAirBookRS;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSInput;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSOutput;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.jaxb.JAXBHelper;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;

/**
 * 调用航班信息查询服务OTA_AirAvailLLS封装类
 * @author Jason.Ma
 */
public class OTA_AirBookLLSEP implements ISabreEndpoint<OTA_AirBookLLSInput,OTA_AirBookLLSOutput>{
	
	public static final String ACTION_CODE = "OTA_AirBookLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.0.0";
	
	private static OTA_AirBookLLSEP instance = new OTA_AirBookLLSEP();
	
	private OTA_AirBookLLSEP(){
		
	}
	
	public static OTA_AirBookLLSEP getInstance(){
		return instance;
	}

	public OTA_AirBookLLSOutput call(SabreConnection conn,OTA_AirBookLLSInput input) throws SabreClientException{
		conn.prepare();
		OTA_AirBookLLSOutput output = new OTA_AirBookLLSOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, OTA_AirBookLLSInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, OTA_AirBookLLSInput input) throws BuildMessageException {
		String strPayload = null;
		//创建payload部分
//		try {
			//用Document对象创建调用报文
//			Document doc = SabreSOAPHelper.createNewDocument();
//			Element oTA_AirBookRQ = doc.createElementNS(SabreSOAPNames.QNAME_SABRE_XML, "OTA_AirBookRQ");
//			oTA_AirBookRQ.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XS_P,SabreSOAPNames.QNAME_XS);
//			oTA_AirBookRQ.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XSI_P,SabreSOAPNames.QNAME_XSI);
//			oTA_AirBookRQ.setAttribute("Version", PAYLOAD_VERSION);
//			
//			Element originDestinationInformation = doc.createElement("OriginDestinationInformation");
//			
//			Element flightSegment = doc.createElement("FlightSegment");
//			flightSegment.setAttribute("DepartureDateTime", input.getDepartureDateTime());
//			flightSegment.setAttribute("FlightNumber", input.getFlightNumber());
//			flightSegment.setAttribute("NumberInParty", input.getNumberInParty());
//			flightSegment.setAttribute("Status", input.getStatus());
//			flightSegment.setAttribute("ResBookDesigCode", input.getResBookDesigCode());
//			
//			Element destinationLocation = doc.createElement("DestinationLocation");
//			destinationLocation.setAttribute("LocationCode", input.getdLocationCode());
//			flightSegment.appendChild(destinationLocation);
//			Element marketingAirline = doc.createElement("MarketingAirline");
//			marketingAirline.setAttribute("Code", input.getMarketingAirlineCode());
//			marketingAirline.setAttribute("FlightNumber", input.getMarketingAirlineFlightNumber());
//			flightSegment.appendChild(marketingAirline);
//			Element originLocation = doc.createElement("OriginLocation");
//			originLocation.setAttribute("LocationCode", input.getoLocationCode());
//			flightSegment.appendChild(originLocation);
//			
//			originDestinationInformation.appendChild(flightSegment);
//			oTA_AirBookRQ.appendChild(originDestinationInformation);
//			doc.appendChild(oTA_AirBookRQ);
//			strPayload = SabreSOAPHelper.xmlDocumentToString(doc);
			
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		}
		OTAAirBookRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		strPayload = JAXBHelper.marshall(rq);
		return strPayload;
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,OTA_AirBookLLSOutput output) throws SabreClientException {
		// 获取请求成功后的返回信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,OTA_AirBookLLSOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		OTAAirBookRS rs =  (OTAAirBookRS) JAXBHelper.unmarshall(OTAAirBookRS.class, doc);
		ApplicationResults applicationResults = rs.getApplicationResults();
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
		output.setRs(rs);
	}
	
}
