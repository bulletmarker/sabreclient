package com.itsum.sabre.client.soap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.AbstractRQ;
import com.itsum.sabre.client.dto.AbstractRS;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.util.SabreUtil;

/**
 * Sabre调用的文档处理帮助类
 * @author Jason.Ma
 *
 */
public class SabreSOAPHelper{
	
	public static DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();

	/**
	 * 产生空白的RQ请求的SOAP消息
	 */
	public static SOAPMessage createNewSOAPMessage(){
		SOAPMessage soapMessage = null;
		try {
			soapMessage = MessageFactory.newInstance().createMessage();
		} catch (SOAPException e) {
			e.printStackTrace();
		}
		return soapMessage;
	}
	
	/**
	 * 创建请求消息
	 * @param conn
	 * @param input
	 * @param actionCode
	 * @return
	 * @throws BuildMessageException
	 */
	public static SOAPMessage createMessage(SabreConnection conn,AbstractRQ input,String actionCode) throws BuildMessageException{
		SOAPMessage message = null;
		//创建标准报文
		message = SabreSOAPHelper.createNewSOAPMessage();
		//填充公共封套信息
		setRQEnvelope(message,conn);
		//设置公共报文头部分
		setRQMessageHeader(message,conn,actionCode);
		//设置SessionCreateRQ的Security部分
		if("SessionCreateRQ".equals(actionCode)){
			setSessionCreateRQMessageSecurity(message, conn, actionCode);
		}else{
			setTPFRQMessageSecurity(message,conn,actionCode);
		}
		//设置公共报文体部分
		setRQMessageBody(message,conn,actionCode);
		return message;
	}
	
	/**
	 * 产生RQ请求的封套
	 * @param soapEnvelope
	 */
	public static void setRQEnvelope(SOAPMessage soapMessage,SabreConnection conn){
		if(soapMessage != null){
			try {
				SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
				soapEnvelope.addNamespaceDeclaration(SabreSOAPNames.QNAME_EB_P,SabreSOAPNames.QNAME_EB);
				soapEnvelope.addNamespaceDeclaration(SabreSOAPNames.QNAME_XLINK_P,SabreSOAPNames.QNAME_XLINK);
				soapEnvelope.addNamespaceDeclaration(SabreSOAPNames.QNAME_XSD_P,SabreSOAPNames.QNAME_XSD);
			} catch (SOAPException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 产生RQ请求的头部分
	 * @param soapMessage
	 * @param conn
	 * @param actionCode
	 * @throws BuildMessageException 
	 */
	public static void setRQMessageHeader(SOAPMessage soapMessage,SabreConnection conn,String actionCode) throws BuildMessageException{
		try {
			SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
			SOAPHeader soapHeader = soapEnvelope.getHeader();
			//QName a = new QName(namespaceURI, localPart)
			SOAPElement messageHeaderE = soapHeader.addChildElement("MessageHeader", SabreSOAPNames.QNAME_EB_P);
			messageHeaderE.addAttribute(soapEnvelope.createQName("mustUnderstand", SabreSOAPNames.QNAME_SOAP_ENV_P), SabreSOAPNames.MUSTUNDERSTAND);
			messageHeaderE.addAttribute(soapEnvelope.createQName("version", SabreSOAPNames.QNAME_EB_P), SabreSOAPNames.VERSION);
			//from
			SOAPElement fromE = messageHeaderE.addChildElement("From", SabreSOAPNames.QNAME_EB_P);
			SOAPElement fromPartyIdE = fromE.addChildElement("PartyId", SabreSOAPNames.QNAME_EB_P);
			fromPartyIdE.addAttribute(soapEnvelope.createName("type"), SabreSOAPNames.PARTYID_TYPE);
			fromPartyIdE.addTextNode(conn.getClientURN());
			//to
			SOAPElement toE =  messageHeaderE.addChildElement("To", SabreSOAPNames.QNAME_EB_P);
			toE.addAttribute(soapEnvelope.createName("type"), SabreSOAPNames.PARTYID_TYPE);
			SOAPElement toPartyIdE = toE.addChildElement("PartyId", SabreSOAPNames.QNAME_EB_P);
			toPartyIdE.addTextNode(conn.getEndpointURL());
			//CPAId
			messageHeaderE.addChildElement("CPAId", SabreSOAPNames.QNAME_EB_P).addTextNode(conn.getCpaId());
			//ConversationId
			messageHeaderE.addChildElement("ConversationId", SabreSOAPNames.QNAME_EB_P).addTextNode(conn.getConversationId());
			//Service
			SOAPElement serviceE = messageHeaderE.addChildElement("Service", SabreSOAPNames.QNAME_EB_P);
			serviceE.addAttribute(soapEnvelope.createQName("type", SabreSOAPNames.QNAME_EB_P), SabreSOAPNames.EB_SERVICE_TYPE);
			serviceE.addTextNode(actionCode);
			//Action
			messageHeaderE.addChildElement("Action", SabreSOAPNames.QNAME_EB_P).addTextNode(actionCode);
			//MessageData
			SOAPElement messageDataE = messageHeaderE.addChildElement("MessageData", SabreSOAPNames.QNAME_EB_P);
			messageDataE.addChildElement("MessageId", SabreSOAPNames.QNAME_EB_P).addTextNode(SabreUtil.genMassageId());
			messageDataE.addChildElement("Timestamp", SabreSOAPNames.QNAME_EB_P).addTextNode(conn.getCtimestamp());
			messageDataE.addChildElement("TimeToLive", SabreSOAPNames.QNAME_EB_P).addTextNode(conn.getCtimestamp());
			setSessionCreateRQMessageSecurity(soapMessage,conn,actionCode);
		} catch (SOAPException e) {
			throw new BuildMessageException("创建SessionCreateRQ消息失败",e);
		}
	}
	
	/**
	 * 产生SessionCreateRQ请求的头部分
	 * @param soapMessage
	 * @param conn
	 * @param actionCode
	 * @throws BuildMessageException 
	 */
	public static void setSessionCreateRQMessageSecurity(SOAPMessage soapMessage,SabreConnection conn,String actionCode) throws BuildMessageException{
		try {
			SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
			SOAPHeader soapHeader = soapEnvelope.getHeader();
			//wsse:Security
			SOAPElement securityE = soapHeader.addChildElement("Security",SabreSOAPNames.QNAME_WSSE_P,SabreSOAPNames.QNAME_WSSE);
			securityE.addNamespaceDeclaration(SabreSOAPNames.QNAME_WSU_P, SabreSOAPNames.QNAME_WSU);
			//UsernameToken
			SOAPElement usernameTokenE = securityE.addChildElement("UsernameToken",SabreSOAPNames.QNAME_WSSE_P);
			usernameTokenE.addChildElement("Username",SabreSOAPNames.QNAME_WSSE_P).addTextNode(conn.getUsername());
			usernameTokenE.addChildElement("Password",SabreSOAPNames.QNAME_WSSE_P).addTextNode(conn.getPassword());
			usernameTokenE.addChildElement("Organization").addTextNode(conn.getOrganization());
			usernameTokenE.addChildElement("Domain").addTextNode(conn.getDomain());
		} catch (SOAPException e) {
			throw new BuildMessageException("创建SessionCreateRQ消息失败",e);
		}
	}
	
	/**
	 * 产生TPFRQ请求的头部分
	 * @param soapMessage
	 * @param conn
	 * @param actionCode
	 */
	public static void setTPFRQMessageSecurity(SOAPMessage soapMessage,SabreConnection conn,String actionCode){
		try {
			SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
			SOAPHeader soapHeader = soapEnvelope.getHeader();
			//wsse:Security
			SOAPElement securityE = soapHeader.addChildElement("Security",SabreSOAPNames.QNAME_WSSE_P,SabreSOAPNames.QNAME_WSSE);
			securityE.addNamespaceDeclaration(SabreSOAPNames.QNAME_WSU_P, SabreSOAPNames.QNAME_WSU);
			//UsernameToken
			SOAPElement binarySecurityTokenE = securityE.addChildElement("BinarySecurityToken",SabreSOAPNames.QNAME_WSSE_P);
			binarySecurityTokenE.addAttribute(soapEnvelope.createName("valueType"),"String");
			binarySecurityTokenE.addAttribute(soapEnvelope.createName("EncodingType"),"wsse:Base64Binary");
			binarySecurityTokenE.setTextContent(conn.getBinarySecurityToken());
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 产生RQ请求的Body部分
	 * @param soapMessage
	 * @param conn
	 * @param actionCode
	 */
	public static void setRQMessageBody(SOAPMessage soapMessage,SabreConnection conn,String actionCode){
		try {
			SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
			SOAPBody body = soapEnvelope.getBody();
			//Manifest
			SOAPElement manifestE = body.addChildElement("Manifest",SabreSOAPNames.QNAME_EB_P);
			manifestE.addAttribute(soapEnvelope.createQName("mustUnderstand", SabreSOAPNames.QNAME_SOAP_ENV_P), SabreSOAPNames.MUSTUNDERSTAND);
			manifestE.addAttribute(soapEnvelope.createQName("version", SabreSOAPNames.QNAME_EB_P), SabreSOAPNames.VERSION);
			SOAPElement referenceE = manifestE.addChildElement("Reference", SabreSOAPNames.QNAME_XLINK_P, SabreSOAPNames.QNAME_XLINK);
			referenceE.addAttribute(soapEnvelope.createQName("href", SabreSOAPNames.QNAME_XLINK_P), "cid:" + actionCode);
			referenceE.addAttribute(soapEnvelope.createQName("type", SabreSOAPNames.QNAME_XLINK_P),SabreSOAPNames. XLINK_TYPE);
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将payload设置到报文信息的附件中
	 * @param message SOAP报文
	 * @param payload  payload附件
	 */
	public static void setPayloadPart(SOAPMessage message,String payload,String actionCode){
		AttachmentPart ap = message.createAttachmentPart(payload, SabreSOAPNames.SABRE_SOAPMIMETYPE);
		ap.setContentId(actionCode);
		message.addAttachmentPart(ap);
	}
	
	/**
	 * 重新获取一个空白的Document对象
	 * @return
	 * @throws ParserConfigurationException
	 */
	public static Document createNewDocument() throws ParserConfigurationException{
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(false);
		DocumentBuilder builder = domFactory.newDocumentBuilder();
		return builder.newDocument();
	}
	
	/**
	 * 将org.w3c.dom.Document对象转换为报文需要的text/html字符串对象
	 * @param doc 需要转换的文档对象
	 * @return 转换后的String对象
	 * @throws TransformerException 转换是发生异常
	 */
	public static String xmlDocumentToString(Document doc){
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			t.setOutputProperty("encoding", "UTF-8");// 解决中文问题
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			t.transform(new DOMSource(doc), new StreamResult(bos));
			return bos.toString();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 从SOAPMessage解析出附件Document对象
	 * @param soap
	 * @return
	 * @throws ParseMessageException 
	 */
	public static Document parsePayloadMessage(SOAPMessage receive,String actionCode) throws ParseMessageException{
		Document doc = null;
		try{
			@SuppressWarnings("unchecked")
			Iterator<AttachmentPart> it = receive.getAttachments();
			AttachmentPart tmp = null;
			while(it.hasNext()){
				tmp = it.next();
				if(tmp.getContentId() != null && tmp.getContentId().equals(actionCode)){
					StreamSource content = (StreamSource) tmp.getContent();
					domFactory.setNamespaceAware(true);
					DocumentBuilder builder = domFactory.newDocumentBuilder();
					doc = builder.parse(content.getInputStream());
					break;
				}
			}
		} catch (SOAPException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		} catch (ParserConfigurationException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		} catch (UnsupportedEncodingException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		} catch (SAXException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		} catch (IOException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		}
		
		return doc;	
	}
	
	/**
	 * 从SOAPMessage解析出附件Document对象
	 * @param soap
	 * @return
	 * @throws ParseMessageException 
	 */
	public static InputStream parsePayloadStream(SOAPMessage receive,String actionCode) throws ParseMessageException{
		InputStream doc = null;
		try{
			@SuppressWarnings("unchecked")
			Iterator<AttachmentPart> it = receive.getAttachments();
			AttachmentPart tmp = null;
			while(it.hasNext()){
				tmp = it.next();
				if(tmp.getContentId() != null && tmp.getContentId().equals(actionCode)){
					if("text/plain".equalsIgnoreCase(tmp.getContentType())){
						String content = (String) tmp.getContent();
						doc = new ByteArrayInputStream(content.getBytes("UTF-8"));
					}else{
						StreamSource content = (StreamSource) tmp.getContent();
						doc = content.getInputStream();
					}
					break;
				}
			}
		} catch (SOAPException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		} catch (UnsupportedEncodingException e) {
			throw new ParseMessageException("解析业务信息异常",e);
		}
		return doc;	
	}	
	
	/**
	 * 解析公共消息头部分
	 * @param receive
	 * @param conn
	 * @param output
	 * @throws SabreClientException 
	 */
	public static void parseMessage(SOAPMessage receive, SabreConnection conn,
			AbstractRS output) throws SabreClientException {
		// 获取请求成功后的返回信息
		parseError(receive, output);
		if (!output.isSuccess()) {
			return;
		}
		// 获取公共报文信息
		SabreSOAPHelper.parseCommonMessage(receive, output);
	}
	
	/**
	 * 检查返回信息是否包含错误
	 * @param message
	 * @return
	 * @throws SabreClientException 
	 */
	public static void parseError(SOAPMessage message,AbstractRS output) throws SabreClientException{
		//TODO 检查报文中是否存在错误信息
		try {
			SOAPBody body = message.getSOAPBody();
			NodeList faultsnl = body.getElementsByTagNameNS(SabreSOAPNames.QNAME_SOAP_ENV, "Fault");
			if(faultsnl.getLength() > 0){
				SabreClientException e = new SabreClientException("调用服务失败");
				Node fault = faultsnl.item(0);
				NodeList fl = fault.getChildNodes();
				for(int i = 0 ; i < fl.getLength() ; i ++){
					Node n = fl.item(i);
					if("faultcode".equals(n.getNodeName())){
						e.setErrorCode(n.getTextContent());
					}else if("faultstring".equals(n.getNodeName())){
						e.setErrorInfo(n.getTextContent());
					}else if("detail".equals(n.getNodeName())){
						e.setErrorMessage(n.getChildNodes().item(0).getTextContent());
					}
				}
				throw e;
			}else{
				output.setSuccess(true);
			}
		} catch (SOAPException e) {
			throw new ParseMessageException("解析公共消息异常", e);
		}
	}
	
	/**
	 * 解析公共消息信息
	 * @param message
	 * @param output
	 * @throws ParseMessageException 
	 */
	public static void parseCommonMessage(SOAPMessage message,AbstractRS output) throws ParseMessageException{
		//转换返回报文为document对象
		try {
			SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
			SOAPHeader header = envelope.getHeader();
			//获取消息信息
			output.setMessageId(header.getElementsByTagNameNS(SabreSOAPNames.QNAME_EB, "MessageId").item(0).getTextContent());
			output.setRefToMessageId(header.getElementsByTagNameNS(SabreSOAPNames.QNAME_EB, "RefToMessageId").item(0).getTextContent());
		} catch (SOAPException e) {
			throw new ParseMessageException("解析公共消息异常", e);
		}
	}
}
