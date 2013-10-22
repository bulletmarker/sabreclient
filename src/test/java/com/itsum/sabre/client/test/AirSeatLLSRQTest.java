package com.itsum.sabre.client.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.airseat.AirSeatLLSInput;
import com.itsum.sabre.client.dto.airseat.AirSeatLLSOutput;
import com.itsum.sabre.client.dto.airseat.AirSeatRQ;
import com.itsum.sabre.client.dto.airseat.AirSeatRS;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadLLSInput;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadRQ;
import com.itsum.sabre.client.dto.travelitineraryread.TravelItineraryReadRS;
import com.itsum.sabre.client.endpoint.AirSeatLLSEP;
import com.itsum.sabre.client.endpoint.TravelItineraryReadLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

public class AirSeatLLSRQTest {
	
	private static Logger logger = LoggerFactory.getLogger(AirSeatLLSRQTest.class);

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
			
			
			AirSeatLLSInput airSeatLLSInput = new AirSeatLLSInput();
			AirSeatRQ airSeatRQ = new AirSeatRQ();
			AirSeatRQ.Seats seats = new AirSeatRQ.Seats();
			AirSeatRQ.Seats.Seat seat = new AirSeatRQ.Seats.Seat();
			seat.setNameNumber("1.1");
			seat.setNumber("1A");
			seat.setSegmentNumber("1");
			seats.setSeat(seat);
			airSeatRQ.setSeats(seats);
			airSeatLLSInput.setRq(airSeatRQ);
			AirSeatLLSOutput airSeatLLSOutput = AirSeatLLSEP.getInstance().call(conn, airSeatLLSInput);
			if(airSeatLLSOutput != null && airSeatLLSOutput.isSuccess()){
				logger.info("AirSeatLLS调用成功");
				AirSeatRS airSeatRS = airSeatLLSOutput.getRs();
			}else{
				logger.warn("AirSeatLLS调用失败");
				logger.warn("ErrorCode=" + airSeatLLSOutput.getErrorCode());
				logger.warn("ErrorMessage=" + airSeatLLSOutput.getErrorMessage());
				logger.warn("Severity=" + airSeatLLSOutput.getSeverity());
				logger.warn("ErrorInfo=" + airSeatLLSOutput.getErrorInfo());
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
