package com.itsum.sabre.client.dto.ota.airprice;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTA_AirPriceLLSOutput extends AbstractRS {
	
	private OTAAirPriceRS rs = null;

	public OTAAirPriceRS getRs() {
		return rs;
	}

	public void setRs(OTAAirPriceRS rs) {
		this.rs = rs;
	}

}
