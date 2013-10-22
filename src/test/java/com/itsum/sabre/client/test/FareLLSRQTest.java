package com.itsum.sabre.client.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.fare.FareLLSInput;
import com.itsum.sabre.client.dto.fare.FareLLSOutput;
import com.itsum.sabre.client.dto.fare.FareRQ;
import com.itsum.sabre.client.dto.fare.FareRS;
import com.itsum.sabre.client.endpoint.FareLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

public class FareLLSRQTest {
	
	private static Logger logger = LoggerFactory.getLogger(FareLLSRQTest.class);
	
	public static void main(String[] args) throws IOException {
		//初始化系统配置
		InitConfig.init();
		SabreConnection conn = null;
		try{
			conn = SabreConnectionFactory.openConnection();
			FareLLSInput input = new FareLLSInput();
			
			FareRQ rq = new FareRQ();
			
			FareRQ.TPAExtensions tPAExtensions = new FareRQ.TPAExtensions();
			FareRQ.TPAExtensions.MessagingDetails messagingDetails = new FareRQ.TPAExtensions.MessagingDetails();
			FareRQ.TPAExtensions.MessagingDetails.MDRSubset mDRSubset = new FareRQ.TPAExtensions.MessagingDetails.MDRSubset();
			mDRSubset.setCode("FQ07");
			messagingDetails.setMDRSubset(mDRSubset);
			tPAExtensions.setMessagingDetails(messagingDetails);
			rq.setTPAExtensions(tPAExtensions);
			
			FareRQ.OriginLocation originLocation = new FareRQ.OriginLocation();
			originLocation.setCodeContext("HAN");
			originLocation.setLocationCode("NRT");
			rq.setOriginLocation(originLocation);
			
			FareRQ.DestinationLocation destinationLocation = new FareRQ.DestinationLocation();
			destinationLocation.setCodeContext("TPE");
			destinationLocation.setLocationCode("ICN");
			rq.setDestinationLocation(destinationLocation);
			
			FareRQ.TravelDateOptions travelDateOptions = new FareRQ.TravelDateOptions();
			travelDateOptions.setDate("2012-10-12T00:00:00");
			rq.setTravelDateOptions(travelDateOptions);
			input.setRq(rq);
			FareLLSOutput output = FareLLSEP.getInstance().call(conn, input);
			if(output != null && output.isSuccess()){
				logger.info("FareLLSRQ调用成功");
			}else{
				logger.info("FareLLSRQ调用失败");
				logger.info("ErrorCode=" + output.getErrorCode());
				logger.info("ErrorMessage=" + output.getErrorMessage());
				logger.info("Severity=" + output.getSeverity());
				logger.info("ErrorInfo=" + output.getErrorInfo());
			}
			FareRS rs = output.getRs();
		}catch(SabreClientException e){
			logger.info("调用服务失败:");
			logger.info("ErrorCode=" + e.getErrorCode());
			logger.info("ErrorMessage=" + e.getErrorMessage());
			logger.info("Severity=" + e.getSeverity());
			logger.info("ErrorInfo=" + e.getErrorInfo());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SabreClientException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
