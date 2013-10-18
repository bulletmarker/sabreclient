package com.itsum.sabre.service;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ota.airprice.OTAAirPriceRQ;
import com.itsum.sabre.client.dto.ota.airprice.OTA_AirPriceLLSInput;
import com.itsum.sabre.client.dto.ota.airprice.OTA_AirPriceLLSOutput;
import com.itsum.sabre.client.endpoint.OTA_AirPriceLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 航班价格查询服务
 * @author macs
 */
public class OTA_AirPriceService {

	public static OTA_AirPriceLLSOutput priceAir(SabreConnection conn,
			String p_code,String p_quantiry)
			throws SabreClientException {
		OTA_AirPriceLLSInput oTA_AirPriceLLSInput = new OTA_AirPriceLLSInput();
		OTAAirPriceRQ oTAAirPriceRQ = new OTAAirPriceRQ();
		OTAAirPriceRQ.PriceRequestInformation pri = new OTAAirPriceRQ.PriceRequestInformation();
		OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers oq = new OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
		OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pq = new OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
		OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType pt = new OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
		pt.setCode(p_code);
		pt.setQuantity(p_quantiry);
		pq.getPassengerType().add(pt);
		oq.setPricingQualifiers(pq);
		pri.setOptionalQualifiers(oq);
		pri.setRetain(true);
		oTAAirPriceRQ.setPriceRequestInformation(pri);
		oTA_AirPriceLLSInput.setRq(oTAAirPriceRQ);
		OTA_AirPriceLLSOutput output = OTA_AirPriceLLSEP.getInstance().call(conn, oTA_AirPriceLLSInput);
		if (output != null && output.isSuccess()) {
			return output;
		} else {
			throw new SabreClientException(output.getErrorCode(),
					output.getErrorMessage(), output.getSeverity(),
					output.getErrorInfo());
		}
	}
}
