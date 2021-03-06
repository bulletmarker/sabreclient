package com.itsum.sabre.client.exception;

/**
 * Sabre异常
 * @author Jason.ma
 */
public class SabreClientException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String errorCode = null;
	
	private String errorMessage = null;
	
	private String severity = null;
	
	private String errorInfo = null;

	public SabreClientException(String msg){
		super(msg);
	}
	
	
	public SabreClientException(String msg,Throwable e){
		super(msg,e);
	}
	
	public SabreClientException(String p_errorCode,String p_errorMessage,String p_severity,String p_errorInfo){
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
