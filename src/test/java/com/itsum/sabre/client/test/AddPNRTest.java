package com.itsum.sabre.client.test;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSInput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSOutput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRQ;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRS;
import com.itsum.sabre.client.dto.ota.airbook.OTAAirBookRQ;
import com.itsum.sabre.client.dto.ota.airbook.OTAAirBookRS;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSInput;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSInput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoRQ;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoRS;
import com.itsum.sabre.client.endpoint.EndTransactionLLSEP;
import com.itsum.sabre.client.endpoint.OTA_AirBookLLSEP;
import com.itsum.sabre.client.endpoint.TravelItineraryAddInfoLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

public class AddPNRTest {
	
	private static Logger logger = LoggerFactory.getLogger(AddPNRTest.class);

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			//注册PNR
			TravelItineraryAddInfoLLSInput travelItineraryAddInfoLLSInput = new TravelItineraryAddInfoLLSInput();
			TravelItineraryAddInfoRQ travelItineraryAddInfoRQ = new TravelItineraryAddInfoRQ();
			TravelItineraryAddInfoRQ.AgencyInfo agencyInfo = new TravelItineraryAddInfoRQ.AgencyInfo();
			TravelItineraryAddInfoRQ.AgencyInfo.Address address = new TravelItineraryAddInfoRQ.AgencyInfo.Address();
			address.setAddressLine("SIGNET TRAVEL");
			address.setCityName("LOS ANGELES");
			address.setCountryCode("US");
			address.setPostalCode("91733");
			TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv stateCountyProv = new TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv();
			stateCountyProv.setStateCode("CA");
			address.setStateCountyProv(stateCountyProv);
			address.setStreetNmbr("1170 Durfee Ave. Suite ES. El Monte");
			TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs vendorPrefs = new TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs();
			TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline airline = new TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline();
			airline.setHosted(true);
			vendorPrefs.setAirline(airline);
			address.setVendorPrefs(vendorPrefs);
			agencyInfo.setAddress(address);
			
			TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ticketing = new TravelItineraryAddInfoRQ.AgencyInfo.Ticketing();
			//ticketing.setPseudoCityCode("IH9A");
			ticketing.setTicketType("7TAW");
			ticketing.setPseudoCityCode(conn.getCpaId());
			ticketing.setQueueNumber("55");
			ticketing.setShortText("TEST");
			
			agencyInfo.setTicketing(ticketing);
			travelItineraryAddInfoRQ.setAgencyInfo(agencyInfo);
			
			TravelItineraryAddInfoRQ.CustomerInfo customerInfo = new TravelItineraryAddInfoRQ.CustomerInfo();
			TravelItineraryAddInfoRQ.CustomerInfo.Email email = new TravelItineraryAddInfoRQ.CustomerInfo.Email();
			email.setAddress("HOWARD718@HOTMAIL.COM");
			email.setNameNumber("1.1");
			List<TravelItineraryAddInfoRQ.CustomerInfo.Email> emails = customerInfo.getEmail();
			emails.add(email);
			
			List<TravelItineraryAddInfoRQ.CustomerInfo.PersonName> personNames = customerInfo.getPersonName();
			TravelItineraryAddInfoRQ.CustomerInfo.PersonName personName = new TravelItineraryAddInfoRQ.CustomerInfo.PersonName();
			personName.setNameReference("TEST");
			personName.setGivenName("HOWARD");
			personName.setSurname("LIN");
			personNames.add(personName);
			
			TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers contactNumbers = new TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers();
			List<TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber> contactNumbersL= contactNumbers.getContactNumber();
			TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber contactNumber = new TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber();
			contactNumber.setPhone("6052187");
			contactNumber.setPhoneUseType("B");
			contactNumbersL.add(contactNumber);
			customerInfo.setContactNumbers(contactNumbers);
			travelItineraryAddInfoRQ.setCustomerInfo(customerInfo);
			travelItineraryAddInfoLLSInput.setRq(travelItineraryAddInfoRQ);
			TravelItineraryAddInfoLLSOutput travelItineraryAddInfoLLSOutput = TravelItineraryAddInfoLLSEP.getInstance().call(conn, travelItineraryAddInfoLLSInput);
			if(travelItineraryAddInfoLLSOutput != null && travelItineraryAddInfoLLSOutput.isSuccess()){
				logger.info("TravelItineraryAddInfoLLS调用成功");
				TravelItineraryAddInfoRS travelItineraryAddInfoRS = travelItineraryAddInfoLLSOutput.getRs();
			}else{
				logger.warn("TravelItineraryAddInfoLLS调用失败");
				logger.warn("ErrorCode=" + travelItineraryAddInfoLLSOutput.getErrorCode());
				logger.warn("ErrorMessage=" + travelItineraryAddInfoLLSOutput.getErrorMessage());
				logger.warn("Severity=" + travelItineraryAddInfoLLSOutput.getSeverity());
				logger.warn("ErrorInfo=" + travelItineraryAddInfoLLSOutput.getErrorInfo());
				return;
			}
			
			//添加行程预定信息
			OTAAirBookRQ oTAAirBookRQ = new OTAAirBookRQ();
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment();
			flightSegment.setDepartureDateTime("2013-11-20T11:55");
			flightSegment.setArrivalDateTime("2013-11-21T18:55");
			flightSegment.setFlightNumber("6079");
			flightSegment.setNumberInParty("1");
			flightSegment.setStatus("NN");
			flightSegment.setResBookDesigCode("F");
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation f1destinationLocation = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
			f1destinationLocation.setLocationCode("HKG");
			flightSegment.setDestinationLocation(f1destinationLocation);
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation f1OriginLocation = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
			f1OriginLocation.setLocationCode("SFO");
			flightSegment.setOriginLocation(f1OriginLocation);
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirline = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
			marketingAirline.setFlightNumber("6079");
			marketingAirline.setCode("AA");
			flightSegment.setMarketingAirline(marketingAirline);
			
			OTAAirBookRQ.OriginDestinationInformation originDestinationInformation = new OTAAirBookRQ.OriginDestinationInformation();
			oTAAirBookRQ.setOriginDestinationInformation(originDestinationInformation);
			List<OTAAirBookRQ.OriginDestinationInformation.FlightSegment> flightSegments = oTAAirBookRQ.getOriginDestinationInformation().getFlightSegment();
			flightSegments.add(flightSegment);
			OTA_AirBookLLSInput oTA_AirBookLLSInput = new OTA_AirBookLLSInput();
			oTA_AirBookLLSInput.setRq(oTAAirBookRQ);
			OTA_AirBookLLSOutput oTA_AirBookLLSOutput = OTA_AirBookLLSEP.getInstance().call(conn, oTA_AirBookLLSInput);
			if(oTA_AirBookLLSOutput != null && oTA_AirBookLLSOutput.isSuccess()){
				logger.info("OTA_AirBookLLS调用成功");
				OTAAirBookRS oTAAirBookRS = oTA_AirBookLLSOutput.getRs();
			}else{
				logger.warn("OTA_AirBookLLS调用失败");
				logger.warn("ErrorCode=" + oTA_AirBookLLSOutput.getErrorCode());
				logger.warn("ErrorMessage=" + oTA_AirBookLLSOutput.getErrorMessage());
				logger.warn("Severity=" + oTA_AirBookLLSOutput.getSeverity());
				logger.warn("ErrorInfo=" + oTA_AirBookLLSOutput.getErrorInfo());
				return;
			}			
			
			String PNR = null;
			//提交事务
			EndTransactionLLSInput endTransactionLLSInput = new EndTransactionLLSInput();
			EndTransactionRQ endTransactionRQ = new EndTransactionRQ();
			EndTransactionRQ.EndTransaction endTransation = new EndTransactionRQ.EndTransaction();
			endTransation.setInd(true);//是否提交事务
			EndTransactionRQ.EndTransaction.Email receiveEmail = new EndTransactionRQ.EndTransaction.Email();
			receiveEmail.setInd(true);//邮件提醒
			endTransation.setEmail(receiveEmail);
			endTransactionRQ.setEndTransaction(endTransation);
			
			EndTransactionRQ.Source source = new EndTransactionRQ.Source();
			source.setReceivedFrom("LIN HOWARD");
			endTransactionRQ.setSource(source);
			endTransactionLLSInput.setRq(endTransactionRQ);
			EndTransactionLLSOutput endTransactionLLSOutput = EndTransactionLLSEP.getInstance().call(conn, endTransactionLLSInput);
			if(endTransactionLLSOutput != null && endTransactionLLSOutput.isSuccess()){
				logger.info("EndTransactionLLS调用成功");
				EndTransactionRS endTransactionRS = endTransactionLLSOutput.getRs();
				PNR = endTransactionRS.getItineraryRef().getID();
				logger.warn("返回PNR=" + PNR);
			}else{
				logger.warn("EndTransactionLLS调用失败");
				logger.warn("ErrorCode=" + endTransactionLLSOutput.getErrorCode());
				logger.warn("ErrorMessage=" + endTransactionLLSOutput.getErrorMessage());
				logger.warn("Severity=" + endTransactionLLSOutput.getSeverity());
				logger.warn("ErrorInfo=" + endTransactionLLSOutput.getErrorInfo());
				return;
			}
		} catch(SabreClientException e){
			logger.info("调用服务失败:");
			logger.warn("ErrorCode=" + e.getErrorCode());
			logger.warn("ErrorMessage=" + e.getErrorMessage());
			logger.warn("Severity=" + e.getSeverity());
			logger.warn("ErrorInfo=" + e.getErrorInfo());
		}catch (Exception e) {
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
