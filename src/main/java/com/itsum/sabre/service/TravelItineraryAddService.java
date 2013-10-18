package com.itsum.sabre.service;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSInput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSOutput;
import com.itsum.sabre.client.endpoint.TravelItineraryAddInfoLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 添加行程服务
 * @author macs
 */
public class TravelItineraryAddService {

	public static String createPNR(SabreConnection conn,
			TravelItineraryAddInfoLLSInput travelItineraryAddInfoLLSInput)
			throws SabreClientException {
		TravelItineraryAddInfoLLSOutput travelItineraryAddInfoLLSOutput = TravelItineraryAddInfoLLSEP
				.getInstance().call(conn, travelItineraryAddInfoLLSInput);
		if (travelItineraryAddInfoLLSOutput != null && travelItineraryAddInfoLLSOutput.isSuccess()) {
			
		} else {
			throw new SabreClientException(
					travelItineraryAddInfoLLSOutput.getErrorCode(),
					travelItineraryAddInfoLLSOutput.getErrorMessage(),
					travelItineraryAddInfoLLSOutput.getSeverity(),
					travelItineraryAddInfoLLSOutput.getErrorInfo());
		}
		return null;
	}

}
