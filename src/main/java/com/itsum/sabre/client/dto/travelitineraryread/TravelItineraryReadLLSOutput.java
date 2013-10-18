package com.itsum.sabre.client.dto.travelitineraryread;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class TravelItineraryReadLLSOutput extends AbstractRS {
	
	private TravelItineraryReadRS rs = null;

	public TravelItineraryReadRS getRs() {
		return rs;
	}

	public void setRs(TravelItineraryReadRS rs) {
		this.rs = rs;
	}

}
