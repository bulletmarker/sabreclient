package com.itsum.sabre.client.test;

import com.itsum.conf.SystemConfig;
import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.fare.FareLLSInput;
import com.itsum.sabre.client.dto.fare.FareLLSOutput;
import com.itsum.sabre.client.dto.fare.FareRQ;
import com.itsum.sabre.client.dto.fare.FareRS;
import com.itsum.sabre.client.endpoint.FareLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

public class FareLLSRQTest {
	
	public static void main(String[] args) {
		//初始化系统配置
		SystemConfig.init();
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
				System.out.println("FareLLSRQ调用成功");
			}else{
				System.out.println("FareLLSRQ调用失败");
				System.out.println("ErrorCode=" + output.getErrorCode());
				System.out.println("ErrorMessage=" + output.getErrorMessage());
				System.out.println("Severity=" + output.getSeverity());
				System.out.println("ErrorInfo=" + output.getErrorInfo());
			}
			FareRS rs = output.getRs();
		}catch(SabreClientException e){
			System.out.println("调用服务失败:");
			System.out.println("ErrorCode=" + e.getErrorCode());
			System.out.println("ErrorMessage=" + e.getErrorMessage());
			System.out.println("Severity=" + e.getSeverity());
			System.out.println("ErrorInfo=" + e.getErrorInfo());
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
