package com.itsum.sabre.client.exception;

/**
 * Sabre Runtime异常基类
 * @author Jason.ma
 */
public class SabreClientRuntimeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String errorCode = null;
	
	private String errorMessage = null;
	
	private String severity = null;
	
	private String errorInfo = null;

	public SabreClientRuntimeException(String msg){
		super(msg);
	}
	
	
	public SabreClientRuntimeException(String msg,Throwable e){
		super(msg,e);
	}
	
	public SabreClientRuntimeException(String p_errorCode,String p_errorMessage,String p_severity,String p_errorInfo){
		errorCode = p_errorCode;
		errorMessage = p_errorMessage;
		severity = p_severity;
		errorInfo = p_errorInfo;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

}
