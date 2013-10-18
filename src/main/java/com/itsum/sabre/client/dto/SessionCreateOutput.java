package com.itsum.sabre.client.dto;

/**
 * SessionCreateRQ 服务的输出参数
 * @author Jason.Ma
 *
 */
public class SessionCreateOutput extends AbstractRS{
	
	/** 登录成功后生产的登录令牌 */
	private String binarySecurityToken = null;

	public String getBinarySecurityToken() {
		return binarySecurityToken;
	}

	public void setBinarySecurityToken(String binarySecurityToken) {
		this.binarySecurityToken = binarySecurityToken;
	}
	
}
