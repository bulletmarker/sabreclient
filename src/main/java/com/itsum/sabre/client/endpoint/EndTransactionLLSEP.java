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
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSInput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSOutput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRQ;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRS;
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
public class EndTransactionLLSEP implements ISabreEndpoint<EndTransactionLLSInput,EndTransactionLLSOutput>{
	
	public static final String ACTION_CODE = "EndTransactionLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.0.0";
	
	private static EndTransactionLLSEP instance = new EndTransactionLLSEP();
	
	private EndTransactionLLSEP(){
		
	}
	
	public static EndTransactionLLSEP getInstance(){
		return instance;
	}

	public EndTransactionLLSOutput call(SabreConnection conn,EndTransactionLLSInput input) throws SabreClientException{
		conn.prepare();
		EndTransactionLLSOutput output = new EndTransactionLLSOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, EndTransactionLLSInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, EndTransactionLLSInput input) throws BuildMessageException {
		//创建payload部分
		String strPayload = null;
		EndTransactionRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setTimeStamp(SabreUtil.getXMLGregorianCalendarTimestamp());
		strPayload =JAXBHelper.marshall(rq);
		return strPayload;
//		try {
			//用Document对象创建调用报文
//			Document doc = SabreSOAPHelper.createNewDocument();
//			Element endTransactionRQ = doc.createElementNS(SabreSOAPNames.QNAME_SABRE_XML_1, "EndTransactionRQ");
//			endTransactionRQ.setAttribute("Version", PAYLOAD_VERSION);
//			endTransactionRQ.setAttribute("TimeStamp", conn.getCtimestamp());
//			endTransactionRQ.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XS_P,SabreSOAPNames.QNAME_XS);
//			endTransactionRQ.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XSI_P,SabreSOAPNames.QNAME_XSI);
//			
//			
//			
//			Element pos = doc.createElement("POS");
//			Element source = doc.createElement("Source");
//			source.setAttribute("PseudoCityCode", conn.getCpaId());
//			pos.appendChild(source);
//			endTransactionRQ.appendChild(pos);
//			
//			Element updatedBy = doc.createElement("UpdatedBy");
//			Element tPA_Extensions = doc.createElement("TPA_Extensions");
//			Element access = doc.createElement("Access");
//			Element accessPerson = doc.createElement("AccessPerson");
//			Element givenName = doc.createElement("GivenName");
//			givenName.setTextContent(conn.getUsername());
//			accessPerson.appendChild(givenName);
//			access.appendChild(accessPerson);
//			tPA_Extensions.appendChild(access);
//			updatedBy.appendChild(tPA_Extensions);
//			endTransactionRQ.appendChild(updatedBy);
//			
//			Element endTransaction = doc.createElement("EndTransaction");
//			Element sendEmail = doc.createElement("SendEmail");
//			endTransaction.setAttribute("Ind", "true");
//			sendEmail.setAttribute("Ind", "true");
//			endTransaction.appendChild(sendEmail);
//			endTransactionRQ.appendChild(endTransaction);
//			
//			doc.appendChild(endTransactionRQ);
//			strPayload = SabreSOAPHelper.xmlDocumentToString(doc);
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,EndTransactionLLSOutput output) throws SabreClientException {
		// 获取请求成功后的返回信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,EndTransactionLLSOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		EndTransactionRS rs =  (EndTransactionRS) JAXBHelper.unmarshall(EndTransactionRS.class, doc);
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
