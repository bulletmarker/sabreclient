package com.itsum.sabre.client.dto;

/**
 * 输出DTO的抽象类，用来存放公共属性
 * @author Jason.Ma
 */
public class AbstractRS implements ISabreRS{
	
	/** response的massageid*/
	private String messageId = null;
	/** request的massageid*/
	private String refToMessageId = null;
	/** 调用成功标志*/
	private boolean success = false;
	
	private String errorType = null;
	
	private String errorCode = null;
	
	private String errorMessage = null;
	
	private String severity = null;
	
	private String errorInfo = null;

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
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

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getRefToMessageId() {
		return refToMessageId;
	}

	public void setRefToMessageId(String refToMessageId) {
		this.refToMessageId = refToMessageId;
	}

}
