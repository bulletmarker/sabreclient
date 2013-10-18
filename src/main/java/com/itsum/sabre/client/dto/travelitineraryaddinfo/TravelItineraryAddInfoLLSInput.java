package com.itsum.sabre.client.dto.travelitineraryaddinfo;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class TravelItineraryAddInfoLLSInput extends AbstractRQ {
	
	private TravelItineraryAddInfoRQ rq = null;
	
	public TravelItineraryAddInfoRQ getRq() {
		return rq;
	}

	public void setRq(TravelItineraryAddInfoRQ rq) {
		this.rq = rq;
	}

}
