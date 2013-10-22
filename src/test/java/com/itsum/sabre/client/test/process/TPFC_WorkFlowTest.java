package com.itsum.sabre.client.test.process;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.connection.SabreConnectionFactory;
import com.itsum.sabre.client.dto.ota.airbook.OTAAirBookRQ;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSInput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSInput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoRQ;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.test.InitConfig;
import com.itsum.sabre.service.OTA_AirBookService;
import com.itsum.sabre.service.OTA_AirPriceService;
import com.itsum.sabre.service.TravelItineraryAddService;

public class TPFC_WorkFlowTest {
	
	public static Logger logger = LoggerFactory.getLogger(TPFC_WorkFlowTest.class);

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InitConfig.init();
		SabreConnection conn = null;
		try {
			conn = SabreConnectionFactory.openConnection();
			//添加行程基本信息
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
			ticketing.setPseudoCityCode("IH9A");
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
			personName.setSurname("LINL");
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
			TravelItineraryAddService.createPNR(conn, travelItineraryAddInfoLLSInput);
			logger.info("TravelItineraryAddService 调用成功");
			
			//添加行程预定信息
			OTAAirBookRQ oTAAirBookRQ = new OTAAirBookRQ();
			OTAAirBookRQ.OriginDestinationInformation originDestinationInformation = new OTAAirBookRQ.OriginDestinationInformation();
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment();
			flightSegment.setDepartureDateTime("2013-10-18T12:10");
			flightSegment.setArrivalDateTime("2013-10-18T13:35");
			flightSegment.setFlightNumber("566");
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation f1OriginLocation = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
			f1OriginLocation.setLocationCode("LAX");
			flightSegment.setOriginLocation(f1OriginLocation);
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation d1DestinationLocation = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
			d1DestinationLocation.setLocationCode("SFO");
			flightSegment.setDestinationLocation(d1DestinationLocation);
			flightSegment.setNumberInParty("1");
			flightSegment.setStatus("NN");
			flightSegment.setResBookDesigCode("Y");
			
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
			destinationLocation.setLocationCode("SFO");
			flightSegment.setDestinationLocation(destinationLocation);
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirline = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
			marketingAirline.setFlightNumber("356");
			marketingAirline.setCode("UA");
			flightSegment.setMarketingAirline(marketingAirline);
			OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
			originLocation.setLocationCode("LAX");
			flightSegment.setOriginLocation(originLocation);
			List<OTAAirBookRQ.OriginDestinationInformation.FlightSegment> flightSegments =originDestinationInformation.getFlightSegment();
			flightSegments.add(flightSegment);
			oTAAirBookRQ.setOriginDestinationInformation(originDestinationInformation);
			OTA_AirBookLLSInput oTA_AirBookLLSInput = new OTA_AirBookLLSInput();
			oTA_AirBookLLSInput.setRq(oTAAirBookRQ);
			OTA_AirBookService.bookAir(conn, oTA_AirBookLLSInput);
			logger.info("TravelItineraryAddService 调用成功");
			
			OTA_AirPriceService.priceAir(conn, "ADT", "1");
			logger.info("OTA_AirPriceService 调用成功");
			
			conn.commit("LIN HOWARD");
			logger.info("EndTransactionService 调用成功");
			
		} catch(SabreClientException e){
			logger.warn("调用服务失败:");
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
