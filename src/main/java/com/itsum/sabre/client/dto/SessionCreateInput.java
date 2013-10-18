package com.itsum.sabre.client.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * SessionCreateRQ服务的输入参数
 * @author Jason.Ma
 */
@XmlRootElement(name="SessionCreateRQ")
public class SessionCreateInput extends AbstractRQ{
	
	private String pseudoCityCode = null;

	public String getPseudoCityCode() {
		return pseudoCityCode;
	}

	public void setPseudoCityCode(String pseudoCityCode) {
		this.pseudoCityCode = pseudoCityCode;
	}

}
