package com.itsum.sabre.client.endpoint;

import java.io.InputStream;
import java.util.List;

import javax.xml.soap.SOAPMessage;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.ISabreRS;
import com.itsum.sabre.client.dto.common.ApplicationResults;
import com.itsum.sabre.client.dto.common.CompletionCodes;
import com.itsum.sabre.client.dto.common.ProblemInformation;
import com.itsum.sabre.client.dto.common.SystemSpecificResults;
import com.itsum.sabre.client.dto.fare.FareRQ;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSInput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoRQ;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoRS;
import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;
import com.itsum.sabre.client.exception.SabreClientException;
import com.itsum.sabre.client.jaxb.JAXBHelper;
import com.itsum.sabre.client.soap.SabreSOAPHelper;
import com.itsum.sabre.client.soap.SabreSOAPNames;
import com.itsum.sabre.client.util.SabreUtil;

/**
 * 调用SessionCreateRQ服务封装类
 * @author Jason.Ma
 */
public class TravelItineraryAddInfoLLSEP implements ISabreEndpoint<TravelItineraryAddInfoLLSInput,TravelItineraryAddInfoLLSOutput>{
	
	public static final String ACTION_CODE = "TravelItineraryAddInfoLLS";
	
	public static final String ACTION_CODE_RQ = ACTION_CODE + SabreSOAPNames.ACIONTCODE_REQ_S;
	
	public static final String ACTION_CODE_RS = ACTION_CODE + SabreSOAPNames.ACIONTCODE_RESP_S;
	
	public static final String PAYLOAD_VERSION = "2.0.0";
	
	private static TravelItineraryAddInfoLLSEP instance = new TravelItineraryAddInfoLLSEP();
	
	private TravelItineraryAddInfoLLSEP(){
		
	}
	
	public static TravelItineraryAddInfoLLSEP getInstance(){
		return instance;
	}

	public TravelItineraryAddInfoLLSOutput call(SabreConnection conn,TravelItineraryAddInfoLLSInput input) throws SabreClientException{
		conn.prepare();
		TravelItineraryAddInfoLLSOutput output = new TravelItineraryAddInfoLLSOutput();
		//生成业务报文
		SOAPMessage message = createMessage(conn,input);
		String payload = createPayload(conn,input);
		SabreSOAPHelper.setPayloadPart(message, payload, ACTION_CODE_RQ);
		//发送报文
		SOAPMessage receive = EndpointHelper.sendMessage(message, conn);
		
		parseMessage(receive, conn, output);
		parsePayload(receive, conn, output);
		return output;
	}
	
	@Override
	public SOAPMessage createMessage(SabreConnection conn, TravelItineraryAddInfoLLSInput input) throws BuildMessageException {
		return SabreSOAPHelper.createMessage(conn,input,ACTION_CODE_RQ);
	}
	
	@Override
	public String createPayload(SabreConnection conn, TravelItineraryAddInfoLLSInput input) throws BuildMessageException {
		//创建payload部分
//		String strPayload = null;
//		try {
//			//用Document对象创建调用报文
//			Document doc = SabreSOAPHelper.createNewDocument();
//			Element travelItineraryAddInfoLLSRQ = doc.createElementNS(SabreSOAPNames.QNAME_SABRE_XML, "TravelItineraryAddInfoRQ");
//			travelItineraryAddInfoLLSRQ.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XS_P,SabreSOAPNames.QNAME_XS);
//			travelItineraryAddInfoLLSRQ.setAttribute(SabreSOAPNames.QNAME_SABRE_XML_P + ":" + SabreSOAPNames.QNAME_XSI_P,SabreSOAPNames.QNAME_XSI);
//			travelItineraryAddInfoLLSRQ.setAttribute("Version", PAYLOAD_VERSION);
//			travelItineraryAddInfoLLSRQ.setAttribute("ReturnHostCommand", "true");
//			travelItineraryAddInfoLLSRQ.setAttribute("TimeStamp",conn.getCtimestamp());
//			
//			Element agencyInfo = doc.createElement("AgencyInfo");
//			Element address = doc.createElement("Address");
//			Element addressLine = doc.createElement("AddressLine");
//			addressLine.setTextContent(input.getAddressLine());
//			address.appendChild(addressLine);
//			
//			Element cityName = doc.createElement("CityName");
//			cityName.setTextContent(input.getCityName());
//			address.appendChild(cityName);
//			Element countryCode = doc.createElement("CountryCode");
//			countryCode.setTextContent(input.getCountryCode());
//			address.appendChild(countryCode);
//			Element postalCode = doc.createElement("PostalCode");
//			postalCode.setTextContent(input.getPostalCode());
//			address.appendChild(postalCode);
//			Element stateCountyProv = doc.createElement("StateCountyProv");
//			stateCountyProv.setAttribute("StateCode", input.getStreetNmbr());
//			address.appendChild(stateCountyProv);
//			Element streetNmbr = doc.createElement("StreetNmbr");
//			streetNmbr.setTextContent(input.getStreetNmbr());
//			address.appendChild(streetNmbr);
//			Element vendorPrefs = doc.createElement("VendorPrefs");
//			Element airline = doc.createElement("Airline");
//			airline.setAttribute("Hosted", input.getAirlineHosted());
//			vendorPrefs.appendChild(airline);
//			address.appendChild(vendorPrefs);
//			agencyInfo.appendChild(address);
//			Element ticketing = doc.createElement("Ticketing");
//			ticketing.setAttribute("TicketTimeLimit", input.getTicketTimeLimit());
//			ticketing.setAttribute("TicketType", input.getTicketType());
//			ticketing.setAttribute("PseudoCityCode", input.getPseudoCityCode());
//			ticketing.setAttribute("QueueNumber", input.getQueueNumber());
//			ticketing.setAttribute("ShortText", input.getShortText());
//			agencyInfo.appendChild(ticketing);
//			travelItineraryAddInfoLLSRQ.appendChild(agencyInfo);
//			
//			Element customerInfo = doc.createElement("CustomerInfo");
//			//电话
////			Element telephone = doc.createElement("Telephone");
////			telephone.setAttribute("AreaCityCode", input.getTelephoneAreaCityCode());
////			telephone.setAttribute("CountryAccessCode", input.getTelephoneCountryAccessCode());
////			telephone.setAttribute("NameNumber", input.getTelephoneNameNumber());
////			telephone.setAttribute("PhoneLocationType", input.getTelephonePhoneLocationType());
////			telephone.setAttribute("PhoneNumber", input.getTelephonePhoneNumber());
////			customerInfo.appendChild(telephone);
//			
//			Element contactNumbers = doc.createElement("ContactNumbers");
//			Element contactNumber = doc.createElement("ContactNumber");
//			
//			contactNumber.setAttribute("Phone", input.getTelephonePhoneNumber());
//			contactNumber.setAttribute("PhoneUseType", input.getTelephonePhoneLocationType());
//			contactNumbers.appendChild(contactNumber);
//			customerInfo.appendChild(contactNumbers);
//			
//			//邮件
//			Element email = doc.createElement("Email");
//			email.setAttribute("Address", input.getEmailAddress());
//			email.setAttribute("NameNumber", input.getEmailNameNumber());
//			customerInfo.appendChild(email);
//			//姓名
//			Element personName = doc.createElement("PersonName");
//			personName.setAttribute("NameReference", input.getPersonNameNameReference());
//			Element givenName = doc.createElement("GivenName");
//			givenName.setTextContent(input.getGivenName());
//			personName.appendChild(givenName);
//			Element surName = doc.createElement("Surname");
//			surName.setTextContent(input.getSurname());
//			personName.appendChild(surName);
//			customerInfo.appendChild(personName);
//			
//			travelItineraryAddInfoLLSRQ.appendChild(customerInfo);
//			doc.appendChild(travelItineraryAddInfoLLSRQ);
//			strPayload = SabreSOAPHelper.xmlDocumentToString(doc);
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		}
//		return strPayload;
		TravelItineraryAddInfoRQ rq = input.getRq();
		rq.setVersion(PAYLOAD_VERSION);
		rq.setTimeStamp(SabreUtil.getXMLGregorianCalendarTimestamp());
		FareRQ.POS pos = new FareRQ.POS();
		FareRQ.POS.Source source = new FareRQ.POS.Source();
		source.setPseudoCityCode(conn.getCpaId());
		pos.setSource(source);
		return JAXBHelper.marshall(rq);
	}

	@Override
	public void parseMessage(SOAPMessage receive,SabreConnection conn,TravelItineraryAddInfoLLSOutput output) throws SabreClientException {
		// 获取消息信息
		SabreSOAPHelper.parseMessage(receive, conn, output);
	}

	@Override
	public void parsePayload(SOAPMessage receive,SabreConnection conn,TravelItineraryAddInfoLLSOutput output) throws ParseMessageException {
		InputStream doc = SabreSOAPHelper.parsePayloadStream(receive, ACTION_CODE_RS);
		TravelItineraryAddInfoRS rs =  (TravelItineraryAddInfoRS) JAXBHelper.unmarshall(TravelItineraryAddInfoRS.class, doc);
		ApplicationResults applicationResults = rs.getApplicationResults();
		if(CompletionCodes.COMPLETE.equals(applicationResults.getStatus()) && (applicationResults.getError() == null || applicationResults.getError().size() == 0)){
			output.setSuccess(true);
		}else{
			output.setErrorType(ISabreRS.ERRORTYPE_PAYLOAD);
			output.setSuccess(false);
			ProblemInformation error = applicationResults.getError().get(0);
			output.setErrorCode(applicationResults.getStatus().toString());
			List<SystemSpecificResults> sr = error.getSystemSpecificResults();
			if(sr != null && sr.size() > 0){
				SystemSpecificResults s = sr.get(0);
				output.setErrorMessage(s.getShortText());
				output.setSeverity(s.toString());
				output.setErrorInfo((s.getMessage()!=null && s.getMessage().size() > 0) ? error.getSystemSpecificResults().get(0).getMessage().get(0).getValue():null);
			}else{
				output.setErrorMessage("请查看返回报文");
			}
		}
		output.setRs(rs);
	}
	
}
