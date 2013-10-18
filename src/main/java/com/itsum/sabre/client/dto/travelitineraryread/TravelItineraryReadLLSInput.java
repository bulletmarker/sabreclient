package com.itsum.sabre.client.dto.travelitineraryread;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class TravelItineraryReadLLSInput extends AbstractRQ {

	private TravelItineraryReadRQ rq = null;

	public TravelItineraryReadRQ getRq() {
		return rq;
	}

	public void setRq(TravelItineraryReadRQ rq) {
		this.rq = rq;
	}
	
}
