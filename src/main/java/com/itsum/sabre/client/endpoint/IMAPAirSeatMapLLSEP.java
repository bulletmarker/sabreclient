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
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapInput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapOutput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapRQ;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapRS;
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
public class IMAPAirSeatMapLLSEP implements ISabreEndpoint<IMAPAirSeatMapInput,IMAPAirSeatMapOutput>{
	
	public static final String ACTION_CODE = "IMAP_AirSeatMapLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.1.0";
	
	private static IMAPAirSeatMapLLSEP instance = new IMAPAirSeatMapLLSEP();
	
	private IMAPAirSeatMapLLSEP(){
		
	}
	
	public static IMAPAirSeatMapLLSEP getInstance(){
		return instance;
	}

	public IMAPAirSeatMapOutput call(SabreConnection conn,IMAPAirSeatMapInput input) throws SabreClientException{
		conn.prepare();
		IMAPAirSeatMapOutput output = new IMAPAirSeatMapOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, IMAPAirSeatMapInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, IMAPAirSeatMapInput input) throws BuildMessageException {
		//创建payload部分
		String strPayload = null;
		IMAPAirSeatMapRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setReturnHostCommand(true);
		rq.setTimeStamp(SabreUtil.getXMLGregorianCalendarTimestamp());
		strPayload = JAXBHelper.marshall(rq);
		return strPayload;
//		try {
//			//用Document对象创建调用报文
//			Document doc = SabreSOAPHelper.createNewDocument();
//			Element rq = doc.createElementNS(SabreSOAPNames.QNAME_SABRE_XML_1, "AirSeatRQ");
//			rq.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XS_P,SabreSOAPNames.QNAME_XS);
//			rq.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XSI_P,SabreSOAPNames.QNAME_XSI);
//			rq.setAttribute("TimeStamp", "2011-07-28T14:00:00");
//			rq.setAttribute("Version", PAYLOAD_VERSION);
//			
//			Element pos = doc.createElement("POS");
//			Element source = doc.createElement("Source");
//			source.setAttribute("PseudoCityCode", conn.getCpaId());
//			pos.appendChild(source);
//			rq.appendChild(pos);
//			
//			Element seats = doc.createElement("Seats");
//			Element seat = doc.createElement("Seat");
//			seat.setAttribute("NameNumber", input.getNameNumber());
//			seat.setAttribute("Number", input.getNumber());
//			seat.setAttribute("SegmentNumber", input.getSegmentNumber());
//			seats.appendChild(seat);
//			rq.appendChild(seats);
//			
//			doc.appendChild(rq);
//			strPayload = SabreSOAPHelper.xmlDocumentToString(doc);
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,IMAPAirSeatMapOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,IMAPAirSeatMapOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		IMAPAirSeatMapRS rs = (IMAPAirSeatMapRS) JAXBHelper.unmarshall(IMAPAirSeatMapRS.class, doc);
		ApplicationResults applicationResults = rs.getApplicationResults();
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
			errormessage = null;
		}
		output.setRs(rs);
	}
	
}
