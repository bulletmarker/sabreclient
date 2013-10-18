package com.itsum.sabre.client.test;

import com.itsum.conf.SystemConfig;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 初始化系统配置
		SystemConfig.init();
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
				System.out.println("TravelItineraryReadLLS调用成功");
				TravelItineraryReadRS travelItineraryReadRS = travelItineraryReadLLSOutput.getRs();
			}else{
				System.err.println("TravelItineraryReadLLS调用失败");
				System.err.println("ErrorCode=" + travelItineraryReadLLSOutput.getErrorCode());
				System.err.println("ErrorMessage=" + travelItineraryReadLLSOutput.getErrorMessage());
				System.err.println("Severity=" + travelItineraryReadLLSOutput.getSeverity());
				System.err.println("ErrorInfo=" + travelItineraryReadLLSOutput.getErrorInfo());
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
				System.out.println("AirPriceLLS调用成功");
				OTAAirPriceRS oTAAirPriceRS = oTA_AirPriceLLSOutput.getRs();
			}else{
				System.err.println("AirPriceLLS调用失败");
				System.err.println("ErrorCode=" + oTA_AirPriceLLSOutput.getErrorCode());
				System.err.println("ErrorMessage=" + oTA_AirPriceLLSOutput.getErrorMessage());
				System.err.println("Severity=" + oTA_AirPriceLLSOutput.getSeverity());
				System.err.println("ErrorInfo=" + oTA_AirPriceLLSOutput.getErrorInfo());
				return;
			}
		} catch (SabreClientException e) {
			System.err.println("调用服务失败:");
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
