package com.itsum.sabre.client.dto.ota.airprice;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class OTA_AirPriceLLSInput extends AbstractRQ {
	
	public OTAAirPriceRQ rq = null;
	
	public OTAAirPriceRQ getRq() {
		return rq;
	}

	public void setRq(OTAAirPriceRQ rq) {
		this.rq = rq;
	}

}
