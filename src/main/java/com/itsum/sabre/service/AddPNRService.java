package com.itsum.sabre.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsum.sabre.client.connection.SabreConnection;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSInput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionLLSOutput;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRQ;
import com.itsum.sabre.client.dto.endtransaction.EndTransactionRS;
import com.itsum.sabre.client.dto.ota.airbook.OTAAirBookRQ;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSInput;
import com.itsum.sabre.client.dto.ota.airbook.OTA_AirBookLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSInput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoLLSOutput;
import com.itsum.sabre.client.dto.travelitineraryaddinfo.TravelItineraryAddInfoRQ;
import com.itsum.sabre.client.endpoint.EndTransactionLLSEP;
import com.itsum.sabre.client.endpoint.OTA_AirBookLLSEP;
import com.itsum.sabre.client.endpoint.TravelItineraryAddInfoLLSEP;
import com.itsum.sabre.client.exception.SabreClientException;

/**
 * 添加行程信息服务
* @ClassName: TravelItineraryAddInfoService
* @Description: TODO
* @author Jason.ma
* @date 2013年10月30日 下午4:30:22
*
 */
public class AddPNRService {
	
	private static Logger logger = LoggerFactory.getLogger(AddPNRService.class);

	public static String bookItinerary(SabreConnection conn,TravelItineraryAddInfoRQ travelItineraryAddInfoRQ,OTAAirBookRQ oTAAirBookRQ)
			throws SabreClientException {
		TravelItineraryAddInfoLLSInput travelItineraryAddInfoLLSInput = new TravelItineraryAddInfoLLSInput();
		travelItineraryAddInfoLLSInput.setRq(travelItineraryAddInfoRQ);
		TravelItineraryAddInfoLLSOutput travelItineraryAddInfoLLSOutput = TravelItineraryAddInfoLLSEP.getInstance().call(conn, travelItineraryAddInfoLLSInput);
		if (travelItineraryAddInfoLLSOutput != null && travelItineraryAddInfoLLSOutput.isSuccess()) {
			logger.debug("TravelItineraryAddInfoLLS调用成功");
		} else {
			throw new SabreClientException(
					travelItineraryAddInfoLLSOutput.getErrorCode(),
					travelItineraryAddInfoLLSOutput.getErrorMessage(),
					travelItineraryAddInfoLLSOutput.getSeverity(),
					travelItineraryAddInfoLLSOutput.getErrorInfo());
		}
		
		OTA_AirBookLLSInput oTA_AirBookLLSInput = new OTA_AirBookLLSInput();
		oTA_AirBookLLSInput.setRq(oTAAirBookRQ);
		OTA_AirBookLLSOutput oTA_AirBookLLSOutput = OTA_AirBookLLSEP.getInstance().call(conn, oTA_AirBookLLSInput);
		if(oTA_AirBookLLSOutput != null && oTA_AirBookLLSOutput.isSuccess()){
			logger.debug("OTA_AirBookLLS调用成功");
		}else{
			throw new SabreClientException(
					oTA_AirBookLLSOutput.getErrorCode(),
					oTA_AirBookLLSOutput.getErrorMessage(),
					oTA_AirBookLLSOutput.getSeverity(),
					oTA_AirBookLLSOutput.getErrorInfo());
		}
		
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
			EndTransactionRS endTransactionRS = endTransactionLLSOutput.getRs();
			String pnr = endTransactionRS.getItineraryRef().getID();
			logger.debug("EndTransactionLLS调用成功,pnr:"+ pnr);
			return pnr;
		}else{
			throw new SabreClientException(
					endTransactionLLSOutput.getErrorCode(),
					endTransactionLLSOutput.getErrorMessage(),
					endTransactionLLSOutput.getSeverity(),
					endTransactionLLSOutput.getErrorInfo());
		}
	}

}
