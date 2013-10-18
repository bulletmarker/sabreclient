package com.itsum.sabre.client.exception;

/**
 * 连接服务器异常
 * @author lenovo
 *
 */
public class SabreCallException extends SabreClientException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SabreCallException(String msg, Throwable e) {
		super(msg, e);
	}

}
