package com.itsum.sabre.client.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.ota.airprice.OTAAirPriceRQ;
import com.itsum.sabre.client.dto.ota.airprice.OTAAirPriceRS;
import com.itsum.sabre.client.dto.ota.airprice.OTA_AirPriceLLSInput;
import com.itsum.sabre.client.dto.ota.airprice.OTA_AirPriceLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadLLSInput;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadRQ;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadRS;
import com.itsum.sabre.client.endpoint.OTA_AirPriceLLSEP;
import com.itsum.sabre.client.endpoint.TravelItineraryReadLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

public class OTA_AirPriceLLSRQTest {
	
	private static Logger logger = LoggerFactory.getLogger(OTA_AirPriceLLSRQTest.class);

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// 初始化系统配置
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			//通过PNR查询用户预定信息
			TravelItineraryReadLLSInput travelItineraryReadLLSInput = new TravelItineraryReadLLSInput();
			TravelItineraryReadRQ travelItineraryReadRQ = new TravelItineraryReadRQ();
			TravelItineraryReadRQ.MessagingDetails messagingDetails = new TravelItineraryReadRQ.MessagingDetails();
			TravelItineraryReadRQ.MessagingDetails.Transaction tran = new TravelItineraryReadRQ.MessagingDetails.Transaction();
			tran.setCode("PNR");
			messagingDetails.getTransaction().add(tran);
			travelItineraryReadRQ.setMessagingDetails(messagingDetails);
			TravelItineraryReadRQ.UniqueID uid = new TravelItineraryReadRQ.UniqueID();
			uid.setID(ReadPNRTest.PNR);
			travelItineraryReadRQ.setUniqueID(uid);
			
			travelItineraryReadLLSInput.setRq(travelItineraryReadRQ);
			TravelItineraryReadLLSOutput travelItineraryReadLLSOutput = TravelItineraryReadLLSEP.getInstance().call(conn, travelItineraryReadLLSInput);
			if(travelItineraryReadLLSOutput != null && travelItineraryReadLLSOutput.isSuccess()){
				logger.info("TravelItineraryReadLLS调用成功");
				TravelItineraryReadRS travelItineraryReadRS = travelItineraryReadLLSOutput.getRs();
			}else{
				logger.warn("TravelItineraryReadLLS调用失败");
				logger.warn("ErrorCode=" + travelItineraryReadLLSOutput.getErrorCode());
				logger.warn("ErrorMessage=" + travelItineraryReadLLSOutput.getErrorMessage());
				logger.warn("Severity=" + travelItineraryReadLLSOutput.getSeverity());
				logger.warn("ErrorInfo=" + travelItineraryReadLLSOutput.getErrorInfo());
				return;
			}
			
			OTA_AirPriceLLSInput oTA_AirPriceLLSInput = new OTA_AirPriceLLSInput();
			OTAAirPriceRQ oTAAirPriceRQ = new OTAAirPriceRQ();
			OTAAirPriceRQ.PriceRequestInformation pri = new OTAAirPriceRQ.PriceRequestInformation();
			OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers oq = new OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
			OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pq = new OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
			OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType pt = new OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
			pt.setCode("ADT");
			pt.setQuantity("1");
			pq.getPassengerType().add(pt);
			oq.setPricingQualifiers(pq);
			pri.setOptionalQualifiers(oq);
			oTAAirPriceRQ.setPriceRequestInformation(pri);
			oTA_AirPriceLLSInput.setRq(oTAAirPriceRQ);
			
			OTA_AirPriceLLSOutput oTA_AirPriceLLSOutput = OTA_AirPriceLLSEP.getInstance().call(conn, oTA_AirPriceLLSInput);
			if(oTA_AirPriceLLSOutput != null && oTA_AirPriceLLSOutput.isSuccess()){
				logger.info("AirPriceLLS调用成功");
				OTAAirPriceRS oTAAirPriceRS = oTA_AirPriceLLSOutput.getRs();
			}else{
				logger.warn("AirPriceLLS调用失败");
				logger.warn("ErrorCode=" + oTA_AirPriceLLSOutput.getErrorCode());
				logger.warn("ErrorMessage=" + oTA_AirPriceLLSOutput.getErrorMessage());
				logger.warn("Severity=" + oTA_AirPriceLLSOutput.getSeverity());
				logger.warn("ErrorInfo=" + oTA_AirPriceLLSOutput.getErrorInfo());
				return;
			}
		} catch (SabreClientException e) {
			logger.warn("调用服务失败:");
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
