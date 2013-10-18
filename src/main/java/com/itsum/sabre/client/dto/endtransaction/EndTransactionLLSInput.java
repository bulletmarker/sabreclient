package com.itsum.sabre.client.dto.endtransaction;

import com.itsum.sabre.client.dto.AbstractRQ;

/**
 * 
 * @author Jason.Ma
 *
 */
public class EndTransactionLLSInput extends AbstractRQ {
	
	private EndTransactionRQ rq = null;

	public EndTransactionRQ getRq() {
		return rq;
	}

	public void setRq(EndTransactionRQ rq) {
		this.rq = rq;
	}
	
	
	
	
}
