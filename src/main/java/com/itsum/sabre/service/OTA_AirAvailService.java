package com.itsum.sabre.service;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ota.airavail.OTAAirAvailRQ;
import com.itsum.sabre.client.dto.ota.airavail.OTA_AirAvailLLSInput;
import com.itsum.sabre.client.dto.ota.airavail.OTA_AirAvailLLSOutput;
import com.itsum.sabre.client.endpoint.OTA_AirAvailLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 航班查询服务
 * @author macs
 */
public class OTA_AirAvailService {

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
	public static OTA_AirAvailLLSOutput queryAvail(SabreConnection conn,
			String p_departureDateTime, String p_arrivalDateTime,
			String p_originLocation, String p_destinationLocation)
			throws SabreClientException {

		OTA_AirAvailLLSInput input = new OTA_AirAvailLLSInput();
		OTAAirAvailRQ rq = new OTAAirAvailRQ();
		OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = new OTAAirAvailRQ.OriginDestinationInformation();
		OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
		//出发和到达时间
		flightSegment.setDepartureDateTime(p_departureDateTime);
		flightSegment.setArrivalDateTime(p_arrivalDateTime);
		OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
		//目的地和出发地
		destinationLocation.setLocationCode(p_destinationLocation);
		flightSegment.setDestinationLocation(destinationLocation);
		OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
		originLocation.setLocationCode(p_originLocation);
		flightSegment.setOriginLocation(originLocation);
		originDestinationInformation.setFlightSegment(flightSegment);
		rq.setOriginDestinationInformation(originDestinationInformation);
		input.setRq(rq);
		OTA_AirAvailLLSOutput output = OTA_AirAvailLLSEP.getInstance().call(conn, input);
		if (output != null && output.isSuccess()) {
			// System.out.println("OTA_AirAvailLLS调用成功");
			return output;
		} else {
			throw new SabreClientException(output.getErrorCode(),
					output.getErrorMessage(), output.getSeverity(),
					output.getErrorInfo());
		}

	}

}
