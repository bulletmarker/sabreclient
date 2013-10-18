package com.itsum.sabre.client.dto.ota.airbook;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTA_AirBookLLSOutput extends AbstractRS {
	
	private OTAAirBookRS rs = null;

	public OTAAirBookRS getRs() {
		return rs;
	}

	public void setRs(OTAAirBookRS rs) {
		this.rs = rs;
	}

}
