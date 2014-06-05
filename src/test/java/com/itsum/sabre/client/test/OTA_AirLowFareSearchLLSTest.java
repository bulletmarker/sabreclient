package com.itsum.sabre.client.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.service.OTA_AirLowFareSearchLLSService;

public class OTA_AirLowFareSearchLLSTest {
	
	private static Logger logger = LoggerFactory.getLogger(OTA_AirLowFareSearchLLSTest.class);

	public static void main(String[] args) throws IOException {
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			OTA_AirLowFareSearchLLSService.queryLowFare(conn, "2014-05-27T15:00:00", "LAX", "SFO");
			logger.info("OTA_AirLowFareSearchLLS 调用成功");
		} catch (SabreClientException e) {
			logger.warn("调用OTA_AirLowFareSearchLLS服务失败:");
			logger.warn("ErrorCode=" + e.getErrorCode());
			logger.warn("ErrorMessage=" + e.getErrorMessage());
			logger.warn("Severity=" + e.getSeverity());
			logger.warn("ErrorInfo=" + e.getErrorInfo());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SabreClientException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
