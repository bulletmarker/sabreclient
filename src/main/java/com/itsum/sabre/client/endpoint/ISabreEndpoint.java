package com.itsum.sabre.client.endpoint;

import javax.xml.soap.SOAPMessage;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ISabreInpup;
import com.itsum.sabre.client.dto.ISabreRS;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 所有服务Endpoint的接口
 * @author Jason.Ma
 */
public interface ISabreEndpoint<I extends ISabreInpup,O extends ISabreRS> {
	
	/**
	 * 调用服务
	 * @param conn 链接信息
	 * @param input 输入参数
	 * @return 返回参数
	 * @throws SabreClientException 
	 */
	public O call(SabreConnection conn,I input) throws SabreClientException;
	
	/**
	 * 创建消息部分，需要每个交易去实现
	 * @param conn
	 * @param input
	 * @return
	 * @throws BuildMessageException 
	 */
	public SOAPMessage createMessage(SabreConnection conn,I input) throws BuildMessageException ;

	/**
	 * 创建消息的业务部分，需要每个交易去实现
	 * @param message
	 * @param conn
	 * @param input
	 * @return
	 * @throws BuildMessageException 
	 */
	public String createPayload(SabreConnection conn,I input) throws BuildMessageException;
	
	/**
	 * 解析返回报文消息部分
	 * @param receive
	 * @param conn
	 * @param output
	 * @return
	 * @throws ParseMessageException 
	 */
	public void parseMessage(SOAPMessage receive,SabreConnection conn,O output) throws SabreClientException;
	
	/**
	 * 解析返回报文，payload部分并返回输出对象
	 * @param receive
	 * @param conn
	 * @param output
	 * @return
	 * @throws ParseMessageException 
	 */
	public void parsePayload(SOAPMessage receive,SabreConnection conn,O output) throws ParseMessageException;

}
