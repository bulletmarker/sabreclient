package com.itsum.sabre.client.dto.ota.airlowfare;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTAAirLowFareSearchOutput extends AbstractRS {
	
	private OTAAirLowFareSearchRS rs = null;

	public OTAAirLowFareSearchRS getRs() {
		return rs;
	}

	public void setRs(OTAAirLowFareSearchRS rs) {
		this.rs = rs;
	}

}
