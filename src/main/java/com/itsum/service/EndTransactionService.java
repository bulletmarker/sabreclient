package com.itsum.service;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSInput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSOutput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRQ;
import com.itsum.sabre.client.endpoint.EndTransactionLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * OTF事务提交服务
 * @author macs
 */
public class EndTransactionService {

	/**
	 * 提交事务方服务
	 * @param conn 当前连接
	 * @param receiver 接收者
	 * @return
	 * @throws SabreClientException
	 */
	public static EndTransactionLLSOutput commit(SabreConnection conn,String receiver)
			throws SabreClientException {
		//提交事务
		EndTransactionLLSInput endTransactionLLSInput = new EndTransactionLLSInput();
		EndTransactionRQ endTransactionRQ = new EndTransactionRQ();
		EndTransactionRQ.EndTransaction endTransation = new EndTransactionRQ.EndTransaction();
		endTransation.setInd(true);//是否提交事务
		EndTransactionRQ.EndTransaction.Email receiveEmail = new EndTransactionRQ.EndTransaction.Email();
		receiveEmail.setInd(true);//邮件提醒
		endTransation.setEmail(receiveEmail);
		endTransactionRQ.setEndTransaction(endTransation);
		
		EndTransactionRQ.Source source = new EndTransactionRQ.Source();
		source.setReceivedFrom(receiver);
		endTransactionRQ.setSource(source);
		endTransactionLLSInput.setRq(endTransactionRQ);
		EndTransactionLLSOutput output = EndTransactionLLSEP.getInstance().call(conn, endTransactionLLSInput);
		if (output != null && output.isSuccess()) {
			return output;
		} else {
			throw new SabreClientException(output.getErrorCode(),
					output.getErrorMessage(), output.getSeverity(),
					output.getErrorInfo());
		}
	}
}
