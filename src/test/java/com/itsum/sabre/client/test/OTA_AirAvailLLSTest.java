package com.itsum.sabre.client.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.service.OTA_AirAvailService;

public class OTA_AirAvailLLSTest {
	
	private static Logger logger = LoggerFactory.getLogger(OTA_AirAvailLLSTest.class);

	public static void main(String[] args) throws IOException {
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			OTA_AirAvailService.queryAvail(conn, "03-02T12:00", "LAX", "SFO");
			logger.info("OTA_AirAvailService 调用成功");
		} catch (SabreClientException e) {
			logger.warn("调用OTA_AirAvailLLSTest服务失败:");
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
