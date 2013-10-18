package com.itsum.sabre.client.endpoint;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.exception.SabreCallException;

/**
 * Sabre服务的通讯调用帮助类
 * @author Jason.Ma
 */
public class EndpointHelper {
	
	/**
	 * 发送消息到Sabre服务器
	 * @param message
	 * @param conn
	 * @return 服务返回消息
	 * @throws SabreCallException 
	 */
	public static SOAPMessage sendMessage(SOAPMessage message,SabreConnection conn) throws SabreCallException{
		if("true".equalsIgnoreCase(SystemConfig.getProperty("sabre.ws.client.dubug"))){
			try {
				System.out.println("==============================上送报文==============================");
				message.writeTo(System.out);
				System.out.println("");
			} catch (SOAPException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
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
		
		if("true".equalsIgnoreCase(SystemConfig.getProperty("sabre.ws.client.dubug"))){
			try {
				System.out.println("==============================接收报文==============================");
				receive.writeTo(System.out);
				System.out.println("");
			} catch (SOAPException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return receive;
	}

}
