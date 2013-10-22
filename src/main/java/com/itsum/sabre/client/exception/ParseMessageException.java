package com.itsum.sabre.client.exception;

/**
 * 解析返回报文异常
 * @author lenovo
 *
 */
public class ParseMessageException extends SabreClientException{

	private static final long serialVersionUID = 1L;
	
	public ParseMessageException(String msg, Throwable e) {
		super(msg, e);
	}


}
