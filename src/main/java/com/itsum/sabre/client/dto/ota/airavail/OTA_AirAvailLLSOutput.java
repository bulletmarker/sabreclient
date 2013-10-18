package com.itsum.sabre.client.dto.ota.airavail;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTA_AirAvailLLSOutput extends AbstractRS {
	
	private OTAAirAvailRS rs = null;

	public OTAAirAvailRS getRs() {
		return rs;
	}

	public void setRs(OTAAirAvailRS rs) {
		this.rs = rs;
	}

}
