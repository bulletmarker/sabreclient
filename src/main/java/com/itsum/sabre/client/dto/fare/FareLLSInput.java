package com.itsum.sabre.client.dto.fare;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class FareLLSInput extends AbstractRQ {
	
	public FareRQ rq = null;
	
	public FareRQ getRq() {
		return rq;
	}

	public void setRq(FareRQ rq) {
		this.rq = rq;
	}
	
}
