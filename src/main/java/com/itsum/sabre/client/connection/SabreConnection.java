package com.itsum.sabre.client.connection;

import com.itsum.sabre.client.dto.SessionCloseInput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSInput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSOutput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRQ;
import com.itsum.sabre.client.endpoint.EndTransactionLLSEP;
import com.itsum.sabre.client.endpoint.SessionCloseEP;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.util.SabreUtil;

/**
 * Sabre连接封装类，封装对Sabre连接的相关属性
 * 目前不考虑连接池方式，根据sabre提供文档
 * Low volume is defined by several hundred connections per hour, that is, fewer than 0.25 TPS or an average of 900 individual Sabre Web 
 * Services calls per hour during peak times.
 * 采用基础连接方式，如果并发量不大的情况下，可以减少程序的复杂度，增加可维护性
 * @author Jason.Ma
 */
public class SabreConnection {
	
	public SabreConnection(){
		this.id = SabreUtil.genConversationId();
	}
	
	/**
	 * 关闭连接
	 * @throws SabreClientException 
	 */
	public void close() throws SabreClientException{
		SessionCloseEP ep = SessionCloseEP.getInstance();
		SessionCloseInput rq = new SessionCloseInput();
		rq.setPseudoCityCode(this.cpaId);
		ep.call(this, rq);
		System.out.println("关闭连接成功,token=" + this.getBinarySecurityToken() + ",conversationid=" + this.getConversationId());
	}
	
	/**
	 * 提交sabre事务
	 * @throws SabreClientException 
	 */
	public void commit(String receiver) throws SabreClientException{
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
		EndTransactionLLSOutput output = EndTransactionLLSEP.getInstance().call(this, endTransactionLLSInput);
		if (!output.isSuccess()) {
			throw new SabreClientException(output.getErrorCode(),output.getErrorMessage(), output.getSeverity(),output.getErrorInfo());
		}
	}
	
	/**
	 * 在每次连接进行调用前做准备工作
	 */
	public void prepare(){
		stimestamp = null;
		ctimestamp = SabreUtil.getTimestamp();
	}
	
	/**会话ID*/
	private String id = null;
	/**cpaId 同 IPCC **/
	private String cpaId = null;
	/** 验证用户名 **/
	private String username = null;
	/** 验证密码 **/
	private String password = null;
	/** 机构 验证是必须与cpaId相同 **/
	private String organization = null;
	/** 用户域**/
	private String domain = null;
	/** web服务的url**/
	private String endpointURL = null;
	/** 客户端urn */
	private String clientURN = null;
	/** 当前接收消息id */
	private String cReceive = null;
	/** 登录成功后生产的登录令牌 */
	private String binarySecurityToken = null;
	/** 客户端时间戳  */
	private String ctimestamp = null;
	/** 服务端时间戳 */
	private String stimestamp = null;

	public String getCtimestamp() {
		return ctimestamp;
	}

	public void setCtimestamp(String ctimestamp) {
		this.ctimestamp = ctimestamp;
	}

	public String getStimestamp() {
		return stimestamp;
	}

	public void setStimestamp(String stimestamp) {
		this.stimestamp = stimestamp;
	}

	public String getBinarySecurityToken() {
		return binarySecurityToken;
	}

	public void setBinarySecurityToken(String binarySecurityToken) {
		this.binarySecurityToken = binarySecurityToken;
	}

	public String getcReceive() {
		return cReceive;
	}

	public void setcReceive(String cReceive) {
		this.cReceive = cReceive;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getClientURN() {
		return clientURN;
	}

	public void setClientURN(String clientURN) {
		this.clientURN = clientURN;
	}

	public String getEndpointURL() {
		return endpointURL;
	}

	public void setEndpointURL(String endpointURL) {
		this.endpointURL = endpointURL;
	}

	public String getConversationId() {
		return id;
	}

	public void setConversationId(String conversationId) {
		this.id = conversationId;
	}

	public String getCpaId() {
		return cpaId;
	}

	public void setCpaId(String cpaId) {
		this.cpaId = cpaId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
}
