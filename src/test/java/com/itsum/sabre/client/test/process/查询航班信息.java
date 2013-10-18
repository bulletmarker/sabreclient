package com.itsum.sabre.client.test.process;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.service.OTA_AirAvailService;

public class 查询航班信息 {
	
	private static String 出发时间 = "11-20T14:00";
	
	private static String 到达日期 = null;
	
	private static String 出发地 = "SFO";//三位城市代码
	
	private static String 目的地 = "HKG" ;//三位城市代码

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SystemConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			OTA_AirAvailService.queryAvail(conn,出发时间, 到达日期,出发地, 目的地);
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
