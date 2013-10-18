package com.itsum.sabre.client.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.itsum.uuid.GUIDHexGenerator;

/**
 * 
* @ClassName: SabreUtil
* @Description: TODO
* @author Jason.ma
* @date 2013年10月18日 下午5:01:09
*/
public class SabreUtil {
	
	/**会话id前缀*/
	public static final String SABRE_NAME_CONVERSATIONID_PREFIX = "cid:";
	/**消息id前缀 */
	public static final String SABRE_NAME_MASSAGE_PREFIX = "mid:";
	/** 系统域名  */
	public static final String SABRE_NAME_DOMAIN = "supertour.com";
	/** 命名分隔符 */
	public static final String SABRE_NAME_SEPARATOR = "@";
	
	public static final String SABRE_TIMESTAMP_PATTEN = "yyyy-MM-ddEhh-mm-ssZ";

	/** 生成会话id */
	public static String genConversationId() {
		return SABRE_NAME_CONVERSATIONID_PREFIX
				+ GUIDHexGenerator.getInstance().generateId()
				+ SABRE_NAME_SEPARATOR + SABRE_NAME_DOMAIN;
	}
	/** 生成消息id */
	public static String genMassageId(){
		return SABRE_NAME_MASSAGE_PREFIX
				+ GUIDHexGenerator.getInstance().generateId()
				+ SABRE_NAME_SEPARATOR + SABRE_NAME_DOMAIN;
	}
	
	/**
	 * 获得时间戳
	 * @return
	 */
	public static String getTimestamp(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
		sdf.setTimeZone(TimeZone.getDefault());
		String tmp = sdf.format(new Date());
		tmp = tmp.substring(0,22) + ":" + tmp.substring(22); 
		return tmp;
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendarTimestamp(){
		try {
			DatatypeFactory dtf = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			return dtf.newXMLGregorianCalendar(gc);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			return null;
		}
	}
}
