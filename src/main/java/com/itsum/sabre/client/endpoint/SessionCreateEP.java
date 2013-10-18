package com.itsum.sabre.client.endpoint;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.SessionCreateInput;
import com.itsum.sabre.client.dto.SessionCreateOutput;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;

/**
 * 调用SessionCreateRQ服务封装类
 * @author Jason.Ma
 */
public class SessionCreateEP implements ISabreEndpoint<SessionCreateInput,SessionCreateOutput>{
	
	public static final String ACTION_CODE = "SessionCreate";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "1.0";
	
	private static SessionCreateEP instance = new SessionCreateEP();
	
	private SessionCreateEP(){
		
	}
	
	public static SessionCreateEP getInstance(){
		return instance;
	}
	
	public SessionCreateOutput call(SabreConnection conn,SessionCreateInput input) throws SabreClientException{
		conn.prepare();
		SessionCreateOutput output = new SessionCreateOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, SessionCreateInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, SessionCreateInput input) {
		//创建payload部分
		String strPayload = null;
		try {
			//用Document对象创建调用报文
			Document doc = SabreSOAPHelper.createNewDocument();
			Element sessionCreateRQE = doc.createElement("SessionCreateRQ");
			Element posE = doc.createElement("POS");
			sessionCreateRQE.appendChild(posE);
			Element sourceE = doc.createElement("Source");
			sourceE.setAttribute("PseudoCityCode", input.getPseudoCityCode());
			posE.appendChild(sourceE);
			doc.appendChild(sessionCreateRQE);
			strPayload = SabreSOAPHelper.xmlDocumentToString(doc);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return strPayload;
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,SessionCreateOutput output) throws SabreClientException {
		// 获取请求成功后的返回信息
		try {
			SOAPEnvelope envelope = receive.getSOAPPart().getEnvelope();
			SOAPHeader header = envelope.getHeader();
			//获取消息信息
			SabreSOAPHelper.parseMessage(receive, conn, output);
			output.setBinarySecurityToken(header
					.getElementsByTagNameNS(SabreSOAPNames.QNAME_WSSE,
							"BinarySecurityToken").item(0).getTextContent());
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,SessionCreateOutput output) throws ParseMessageException {
		SabreSOAPHelper.parsePayloadMessage(receive, ACTION_CODE_RS);
	}
}
