package com.itsum.sabre.client.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.exception.SabreClientException;

public class OpenCloseSessionTest {
	
	private static Logger logger = LoggerFactory.getLogger(OTA_AirPriceLLSRQTest.class);

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//初始化系统配置
		InitConfig.init();
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
