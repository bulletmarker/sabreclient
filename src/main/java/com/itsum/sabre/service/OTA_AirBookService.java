package com.itsum.sabre.service;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSInput;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSOutput;
import com.itsum.sabre.client.endpoint.OTA_AirBookLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 航班预订服务
 * @author macs
 */
public class OTA_AirBookService {

	public static OTA_AirBookLLSOutput bookAir(SabreConnection conn,
			OTA_AirBookLLSInput oTA_AirBookLLSInput)
			throws SabreClientException {
		OTA_AirBookLLSOutput output = OTA_AirBookLLSEP.getInstance().call(conn,
				oTA_AirBookLLSInput);
		if (output != null && output.isSuccess()) {
			return output;
		} else {
			throw new SabreClientException(output.getErrorCode(),
					output.getErrorMessage(), output.getSeverity(),
					output.getErrorInfo());
		}
	}
}
