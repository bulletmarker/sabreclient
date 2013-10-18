package com.itsum.sabre.client.dto.ota.airavail;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTA_AirAvailLLSInput extends AbstractRQ {
	
	public OTAAirAvailRQ rq = null;
	
	public OTAAirAvailRQ getRq() {
		return rq;
	}

	public void setRq(OTAAirAvailRQ rq) {
		this.rq = rq;
	}

}
