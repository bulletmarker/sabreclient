package com.itsum.sabre.client.dto.airseat;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class AirSeatLLSInput extends AbstractRQ {
	
	private AirSeatRQ rq = null;
	
	public AirSeatRQ getRq() {
		return rq;
	}

	public void setRq(AirSeatRQ rq) {
		this.rq = rq;
	}
}
