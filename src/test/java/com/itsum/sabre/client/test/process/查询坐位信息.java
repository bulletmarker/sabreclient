package com.itsum.sabre.client.test.process;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapInput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapOutput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapRQ;
import com.itsum.sabre.client.endpoint.IMAPAirSeatMapLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

public class 查询坐位信息 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SystemConfig.init();
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
			
			
			System.out.println("IMAPAirSeatMapLLSEP 调用成功");
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
