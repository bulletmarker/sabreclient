package com.itsum.sabre.client.dto.imap.airseatmap;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class IMAPAirSeatMapInput extends AbstractRQ {
	
	public IMAPAirSeatMapRQ rq = null;
	
	public IMAPAirSeatMapRQ getRq() {
		return rq;
	}

	public void setRq(IMAPAirSeatMapRQ rq) {
		this.rq = rq;
	}
	
}
