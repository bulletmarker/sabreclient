package com.itsum.sabre.client.jaxb;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.itsum.sabre.client.exception.BuildMessageException;
import com.itsum.sabre.client.exception.ParseMessageException;

/**
 * J
 * @author lenovo
 */
public class JAXBHelper {
	
	
	
	public static Marshaller getMarshaller(Class<? extends Object> clazz) throws JAXBException{
		JAXBContext context = JAXBContext.newInstance(clazz);
		Marshaller shaller = context.createMarshaller();
		shaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		shaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		return shaller;
	}
	
	public static Unmarshaller getUnmarshaller(Class<? extends Object> clazz) throws JAXBException{
		JAXBContext context = JAXBContext.newInstance(clazz);
		Unmarshaller shaller = context.createUnmarshaller();
		return shaller;
	}
	
	public static Object unmarshall(Class<? extends Object> clazz,InputStream doc) throws ParseMessageException{
		try {
			Unmarshaller shaller = getUnmarshaller(clazz);
			return shaller.unmarshal(doc);
		} catch (JAXBException e) {
			throw new ParseMessageException("解析业务数据失败",e);
		}
	}
	
	/**
	 * 将请求参数序列化为Payload String
	 * @param obj 请求参数
	 * @return
	 * @throws BuildMessageException 
	 * @throws JAXBException
	 */
	public static String marshall(Object obj) throws BuildMessageException{
		String r = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			getMarshaller(obj.getClass()).marshal(obj, bos);
			r = new String(bos.toByteArray());
		} catch (JAXBException e) {
			throw new BuildMessageException("创建业务报文异常", e);
		}
		return r;
	}
	
	

}
