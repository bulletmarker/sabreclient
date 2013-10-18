package com.itsum.sabre.client.dto;

/**
 * 
 * @author Jason.Ma
 *
 */
public class SessionCloseInput extends AbstractRQ {
	
	private String pseudoCityCode = null;

	public String getPseudoCityCode() {
		return pseudoCityCode;
	}

	public void setPseudoCityCode(String pseudoCityCode) {
		this.pseudoCityCode = pseudoCityCode;
	}
}
