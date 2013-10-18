package com.itsum.sabre.client.endpoint;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPMessage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.SessionCloseInput;
import com.itsum.sabre.client.dto.SessionCloseOutput;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;

/**
 * 调用SessionCloseRQ服务封装类
 * @author Jason.Ma
 */
public class SessionCloseEP implements ISabreEndpoint<SessionCloseInput,SessionCloseOutput>{
	
	public static final String ACTION_CODE = "SessionClose";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "1.0";
	
	private static SessionCloseEP instance = new SessionCloseEP();
	
	private SessionCloseEP(){
		
	}
	
	public static SessionCloseEP getInstance(){
		return instance;
	}
	
	public SessionCloseOutput call(SabreConnection conn,SessionCloseInput input) throws SabreClientException{
		conn.prepare();
		SessionCloseOutput output = new SessionCloseOutput();
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
	public SOAPMessage createMessage(SabreConnection conn, SessionCloseInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, SessionCloseInput input) {
		//创建payload部分
		String strPayload = null;
		try {
			//用Document对象创建调用报文
			Document doc = SabreSOAPHelper.createNewDocument();
			Element sessionCloseRQE = doc.createElement("SessionCloseRQ");
			Element posE = doc.createElement("POS");
			sessionCloseRQE.appendChild(posE);
			Element sourceE = doc.createElement("Source");
			sourceE.setAttribute("PseudoCityCode", input.getPseudoCityCode());
			posE.appendChild(sourceE);
			doc.appendChild(sessionCloseRQE);
			strPayload = SabreSOAPHelper.xmlDocumentToString(doc);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return strPayload;
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,SessionCloseOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,SessionCloseOutput output) throws ParseMessageException {
		SabreSOAPHelper.parsePayloadMessage(receive, ACTION_CODE_RS);
		return;
	}
}
