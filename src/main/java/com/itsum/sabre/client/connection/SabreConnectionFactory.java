package com.itsum.sabre.client.connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import com.itsum.sabre.client.cfg.Configuration;
import com.itsum.sabre.client.dto.SessionCreateInput;
import com.itsum.sabre.client.dto.SessionCreateOutput;
import com.itsum.sabre.client.endpoint.SessionCreateEP;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.util.SabreUtil;

/** 
* @ClassName: SabreConnectionFactory
* @Description: Sabre连接工厂类，用于创建对Sabre WS的连接
* @author Jason.ma
* @date 2013年10月18日 下午5:03:17
 */
public class SabreConnectionFactory {
	
	public static Logger log = LoggerFactory.getLogger(SabreConnectionFactory.class);
	
	public static String SABRE_USERNAME = null;
	public static String SABRE_PASSWORD = null;
	public static String SABRE_IPCC = null;
	public static String SABRE_DOMAIN = null;
	public static String SABRE_ENDPOIND_URL = null;
	public static String SABRE_CLIENT_URN = null;
	
	/**
	 * 使用系统默认配置获取新连接，同时创建一个新的会话
	 * @return
	 * @throws SabreClientException 
	 */
	public static SabreConnection openConnection() throws SabreClientException{
		SabreConnection conn = new SabreConnection();
		conn.setId(SabreUtil.genConversationId());
		conn.setCpaId(Configuration.getProperty("sabre.ws.client.ipcc"));
		conn.setDomain(Configuration.getProperty("sabre.ws.client.domain"));
		conn.setOrganization(Configuration.getProperty("sabre.ws.client.ipcc"));
		conn.setPassword(Configuration.getProperty("sabre.ws.client.password"));
		conn.setUsername(Configuration.getProperty("sabre.ws.client.username"));
		conn.setEndpointURL(Configuration.getProperty("sabre.ws.client.endpoind.url"));
		conn.setClientURN(Configuration.getProperty("sabre.ws.client.urn"));
		return openConnection(conn);
	}
	
	/**
	 * 获取新连接，同时创建一个新的会话(暂不开放对外使用接口)
	 * @param conn 用户自定义链接参数
	 * @return
	 * @throws SabreClientException 
	 */
	private static SabreConnection openConnection(SabreConnection conn) throws SabreClientException{
		//调用SessionCreateRQ服务创建会话
		SessionCreateInput sessionCreateRQ = new SessionCreateInput();
		sessionCreateRQ.setPseudoCityCode(conn.getCpaId());
		SessionCreateOutput sessionCreateRS = SessionCreateEP.getInstance().call(conn, sessionCreateRQ);
		conn.setBinarySecurityToken(sessionCreateRS.getBinarySecurityToken());
		log.debug("connection has opened conversationid=" + conn.getConversationId() + ",token=" + conn.getBinarySecurityToken());
		return conn;
	}
	
}
