package com.itsum.sabre.client.test;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.exception.SabreClientException;

public class OpenCloseSessionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//初始化系统配置
		SystemConfig.init();
		SabreConnection conn = null;
		try{
			conn = SabreConnectionFactory.openConnection();
		}catch(SabreClientException e){
			System.err.println("调用服务失败:");
			System.err.println("ErrorCode=" + e.getErrorCode());
			System.err.println("ErrorMessage=" + e.getErrorMessage());
			System.err.println("Severity=" + e.getSeverity());
			System.err.println("ErrorInfo=" + e.getErrorInfo());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SabreClientException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
