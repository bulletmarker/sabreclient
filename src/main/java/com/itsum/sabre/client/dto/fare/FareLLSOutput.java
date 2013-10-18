package com.itsum.sabre.client.dto.fare;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class FareLLSOutput extends AbstractRS {
	
	private FareRS rs = null;

	public FareRS getRs() {
		return rs;
	}

	public void setRs(FareRS rs) {
		this.rs = rs;
	}

}
