package com.itsum.sabre.client.dto.endtransaction;

import com.itsum.sabre.client.dto.AbstractRS;

/**
 * 
 * @author Jason.Ma
 *
 */
public class EndTransactionLLSOutput extends AbstractRS {
	
	private EndTransactionRS rs = null;

	public EndTransactionRS getRs() {
		return rs;
	}

	public void setRs(EndTransactionRS rs) {
		this.rs = rs;
	}

}
