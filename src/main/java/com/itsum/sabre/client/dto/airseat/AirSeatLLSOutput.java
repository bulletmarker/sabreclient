package com.itsum.sabre.client.dto.airseat;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class AirSeatLLSOutput extends AbstractRS {
	
	private AirSeatRS rs = null;

	public AirSeatRS getRs() {
		return rs;
	}

	public void setRs(AirSeatRS rs) {
		this.rs = rs;
	}

}
