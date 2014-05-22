package com.itsum.sabre.client.dto.ota.airlowfare;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTA_AirLowFareSearchInput extends AbstractRQ {
	
	public OTAAirLowFareSearchRQ rq = null;
	
	public OTAAirLowFareSearchRQ getRq() {
		return rq;
	}

	public void setRq(OTAAirLowFareSearchRQ rq) {
		this.rq = rq;
	}

}
