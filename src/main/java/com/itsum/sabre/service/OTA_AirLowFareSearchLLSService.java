package com.itsum.sabre.service;

import java.math.BigInteger;
import java.util.List;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ota.airlowfare.OTAAirLowFareSearchRQ;
import com.itsum.sabre.client.dto.ota.airlowfare.OTAAirLowFareSearchRS;
import com.itsum.sabre.client.dto.ota.airlowfare.OTA_AirLowFareSearchInput;
import com.itsum.sabre.client.dto.ota.airlowfare.OTA_AirLowFareSearchOutput;
import com.itsum.sabre.client.endpoint.OTA_AirLowFareSearchLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
* 
* @ClassName: OTA_AirLowFareSearchLLSService
* @Description: 用来为指定的路线搜索最低可能的价格。这项服务将返回到默认的19行程
* @author Jason.ma
* @date 2014年5月21日 上午10:08:55
*
*/
public class OTA_AirLowFareSearchLLSService {

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
	public static OTAAirLowFareSearchRS queryLowFare(SabreConnection conn,
			String p_departureDateTime,
			String p_originLocation, String p_destinationLocation)
			throws SabreClientException {

		OTA_AirLowFareSearchInput input = new OTA_AirLowFareSearchInput();
		OTAAirLowFareSearchRQ rq = new OTAAirLowFareSearchRQ();
		//设置航班信息
		OTAAirLowFareSearchRQ.OriginDestinationInformation originDestinationInformation = new OTAAirLowFareSearchRQ.OriginDestinationInformation();
		OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment();
		//出发和到达时间
		flightSegment.setDepartureDateTime(p_departureDateTime);
		OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
		//目的地和出发地
		destinationLocation.setLocationCode(p_destinationLocation);
		flightSegment.setDestinationLocation(destinationLocation);
		OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
		originLocation.setLocationCode(p_originLocation);
		flightSegment.setOriginLocation(originLocation);
		flightSegment.setConnectionInd("O");
		flightSegment.setResBookDesigCode("Y");
		
		List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment> flightSegments = originDestinationInformation.getFlightSegment();
		flightSegments.add(flightSegment);
		List<OTAAirLowFareSearchRQ.OriginDestinationInformation> originDestinationInformations = rq.getOriginDestinationInformation();
		originDestinationInformation.setRPH(new BigInteger("1"));
		originDestinationInformations.add(originDestinationInformation);
		
		
		OTAAirLowFareSearchRQ.PriceRequestInformation priceRequestInformation = new OTAAirLowFareSearchRQ.PriceRequestInformation();
		OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers optionalQualifiers = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers();
		
		//设置价格请求信息
		OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pricingQualifiers = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
		List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> passengerTypes = pricingQualifiers.getPassengerType();
		OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType passengerType = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
		passengerType.setCode("ADT");
		passengerType.setQuantity(new BigInteger("2"));
		passengerTypes.add(passengerType);
		optionalQualifiers.setPricingQualifiers(pricingQualifiers);
		
		
		//航班过虑条件
		OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers flightQualifiers = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers();
		optionalQualifiers.setFlightQualifiers(flightQualifiers);
	
		priceRequestInformation.setOptionalQualifiers(optionalQualifiers);
		rq.setPriceRequestInformation(priceRequestInformation);
		
		input.setRq(rq);
		OTA_AirLowFareSearchOutput output = OTA_AirLowFareSearchLLSEP.getInstance().call(conn, input);
		if (output != null && output.isSuccess()) {
			return output.getRs();
		} else {
			throw new SabreClientException(output.getErrorCode(),output.getErrorMessage(), output.getSeverity(),output.getErrorInfo());
		}

	}

}
