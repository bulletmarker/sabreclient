package com.itsum.sabre.client.exception;

/**
 * 
* @ClassName: ConfigureException
* @Description: 配置异常
* @author Jason.ma
* @date 2013年10月21日 上午9:41:28
 */
public class ConfigureException extends SabreClientRuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ConfigureException(String msg,Throwable e) {
		super(msg,e);
	}

}
