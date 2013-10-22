package com.itsum.sabre.client.test.process;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapInput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapOutput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapRQ;
import com.itsum.sabre.client.endpoint.IMAPAirSeatMapLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.test.InitConfig;

public class 查询坐位信息 {
	
	private static Logger logger = LoggerFactory.getLogger(查询坐位信息.class);
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			//查询航班坐位
			IMAPAirSeatMapRQ airSeatMapRQ = new IMAPAirSeatMapRQ();
			IMAPAirSeatMapRQ.OriginDestinationInformation originDestinationInformationSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation();
			IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment flightSegmentAirSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment();
			flightSegmentAirSeatMap.setDepartureDateTime("2013-11-20");
			flightSegmentAirSeatMap.setFlightNumber("6079");
			flightSegmentAirSeatMap.setResBookDesigCode("F");
			IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocationSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
			destinationLocationSeatMap.setLocationCode("HKG");
			flightSegmentAirSeatMap.setDestinationLocation(destinationLocationSeatMap);
			IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocationSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
			originLocationSeatMap.setLocationCode("SFO");
			flightSegmentAirSeatMap.setOriginLocation(originLocationSeatMap);
			IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirlineSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
			marketingAirlineSeatMap.setCode("AA");
			marketingAirlineSeatMap.setFlightNumber("6079");
			flightSegmentAirSeatMap.setMarketingAirline(marketingAirlineSeatMap);
			
			originDestinationInformationSeatMap.setFlightSegment(flightSegmentAirSeatMap);
			airSeatMapRQ.setOriginDestinationInformation(originDestinationInformationSeatMap);
			
			IMAPAirSeatMapInput iMAPAirSeatMapInput = new IMAPAirSeatMapInput();
			iMAPAirSeatMapInput.setRq(airSeatMapRQ);
			IMAPAirSeatMapOutput iMAPAirSeatMapOutput = IMAPAirSeatMapLLSEP.getInstance().call(conn, iMAPAirSeatMapInput);
			
			
			logger.info("IMAPAirSeatMapLLSEP 调用成功");
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
