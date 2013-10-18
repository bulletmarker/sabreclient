package com.itsum.sabre.client.exception;

/**
 * 创建请求报文是发送异常
 * @author lenovo
 *
 */
public class BuildMessageException extends SabreClientException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BuildMessageException(String msg, Throwable e) {
		super(msg, e);
	}

}
