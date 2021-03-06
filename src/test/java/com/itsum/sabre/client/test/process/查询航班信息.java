package com.itsum.sabre.client.test.process;

import java.io.IOException;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.ota.airavail.OTAAirAvailRS;
import com.itsum.sabre.client.dto.ota.airavail.OTA_AirAvailLLSOutput;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.test.InitConfig;
import com.itsum.sabre.service.OTA_AirAvailService;

public class 查询航班信息 {
	
	private static Logger logger = LoggerFactory.getLogger(查询航班信息.class);
	
	private static String 出发时间 = "11-20T14:00";
	
	private static String 出发地 = "SFO";//三位城市代码
	
	private static String 目的地 = "HKG" ;//三位城市代码

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			OTAAirAvailRS rs = OTA_AirAvailService.queryAvail(conn,出发时间,出发地, 目的地);
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			String json = mapper.writeValueAsString(rs);
			logger.info("OTA_AirAvailService 调用成功");
			logger.info(json);
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
