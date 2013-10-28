package com.itsum.sabre.service;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapInput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapOutput;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapRQ;
import com.itsum.sabre.client.dto.imap.airseatmap.IMAPAirSeatMapRS;
import com.itsum.sabre.client.endpoint.IMAPAirSeatMapLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 航班查询服务
 * @author macs
 */
public class IMAP_AirSeatMapService {

	/**
	 * 查询航班列表服务
	 * @param conn 当前连接
	 * @param p_departureDateTime 出发日期
	 * @param p_arrivalDateTime 到达日期
	 * @param p_originLocation 出发地
	 * @param p_destinationLocation 目的地
	 * @return
	 * @throws SabreClientException
	 */
	public static IMAPAirSeatMapRS querySeatMaps(SabreConnection conn,String airline, String flightnumber,String departDate,String fromCity,String toCity,String flightclass)
			throws SabreClientException {

		//查询航班坐位
		IMAPAirSeatMapRQ airSeatMapRQ = new IMAPAirSeatMapRQ();
		IMAPAirSeatMapRQ.OriginDestinationInformation originDestinationInformationSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation();
		IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment flightSegmentAirSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment();
		flightSegmentAirSeatMap.setDepartureDateTime(departDate);
		flightSegmentAirSeatMap.setFlightNumber(flightnumber);
		flightSegmentAirSeatMap.setResBookDesigCode(flightclass);
		//flightSegmentAirSeatMap.setPreference("AN");
		IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocationSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
		destinationLocationSeatMap.setLocationCode(toCity);
		flightSegmentAirSeatMap.setDestinationLocation(destinationLocationSeatMap);
		IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocationSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
		originLocationSeatMap.setLocationCode(fromCity);
		flightSegmentAirSeatMap.setOriginLocation(originLocationSeatMap);
		IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirlineSeatMap = new IMAPAirSeatMapRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
		marketingAirlineSeatMap.setCode(airline);
		marketingAirlineSeatMap.setFlightNumber(flightnumber);
		flightSegmentAirSeatMap.setMarketingAirline(marketingAirlineSeatMap);
		originDestinationInformationSeatMap.setFlightSegment(flightSegmentAirSeatMap);
		airSeatMapRQ.setOriginDestinationInformation(originDestinationInformationSeatMap);
		IMAPAirSeatMapInput iMAPAirSeatMapInput = new IMAPAirSeatMapInput();
		iMAPAirSeatMapInput.setRq(airSeatMapRQ);
		IMAPAirSeatMapOutput output = IMAPAirSeatMapLLSEP.getInstance().call(conn, iMAPAirSeatMapInput);
		if (output != null && output.isSuccess()) {
			return output.getRs();
		} else {
			throw new SabreClientException(output.getErrorCode(),output.getErrorMessage(), output.getSeverity(),output.getErrorInfo());
		}
	}

}
