package com.itsum.sabre.client.endpoint;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.exception.SabreCallException;

/**
 * Sabre服务的通讯调用帮助类
 * @author Jason.Ma
 */
public class EndpointHelper {
	
	private static Logger logger = LoggerFactory.getLogger(EndpointHelper.class);
	
	/**
	 * 发送消息到Sabre服务器
	 * @param message
	 * @param conn
	 * @return 服务返回消息
	 * @throws SabreCallException 
	 */
	public static SOAPMessage sendMessage(SOAPMessage message,SabreConnection conn) throws SabreCallException{
		if(logger.isDebugEnabled()){
			logger.debug("============================== send message ==============================");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			String strMsg;
			try {
				message.writeTo(out);
				strMsg = new String(out.toByteArray(),"UTF-8");
				logger.debug(strMsg);
				out = null;
			} catch (UnsupportedEncodingException e) {
				logger.warn("Message parse error",e);
			} catch (SOAPException e) {
				logger.warn("Message parse error",e);
			} catch (IOException e) {
				logger.warn("Message parse error",e);
			}
		}
		
	    SOAPConnection soapCon = null;
	    SOAPMessage receive = null;
        URL endPointURL;
		try {
			SOAPConnectionFactory conFactory = SOAPConnectionFactory.newInstance();
			soapCon = conFactory.createConnection();
			endPointURL = new URL(conn.getEndpointURL());
			receive = soapCon.call(message, endPointURL);
		} catch (MalformedURLException e) {
			throw new SabreCallException("调用sabre服务异常", e);
		} catch (SOAPException e) {
			throw new SabreCallException("调用sabre服务异常", e);
		}finally{
			if(soapCon != null){
				try {
					soapCon.close();
				} catch (SOAPException e) {
					e.printStackTrace();
				}
			}
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("==============================receive message==============================");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			String strMsg;
			try {
				receive.writeTo(out);
				strMsg = new String(out.toByteArray(),"UTF-8");
				logger.debug(strMsg);
				out = null;
			} catch (UnsupportedEncodingException e) {
				logger.warn("Message parse error",e);
			} catch (SOAPException e) {
				logger.warn("Message parse error",e);
			} catch (IOException e) {
				logger.warn("Message parse error",e);
			}
		}
		return receive;
	}

}
