package com.itsum.sabre.client.test;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.service.OTA_AirAvailService;

public class OTA_AirAvailLLSTest {

	public static void main(String[] args) {
		SystemConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			OTA_AirAvailService.queryAvail(conn, "03-02T12:00", null, "LAX", "SFO");
			System.out.println("OTA_AirAvailService 调用成功");
		} catch (SabreClientException e) {
			System.err.println("调用OTA_AirAvailLLSTest服务失败:");
			System.err.println("ErrorCode=" + e.getErrorCode());
			System.err.println("ErrorMessage=" + e.getErrorMessage());
			System.err.println("Severity=" + e.getSeverity());
			System.err.println("ErrorInfo=" + e.getErrorInfo());
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
