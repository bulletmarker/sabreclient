package com.itsum.sabre.client.cfg;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.itsum.sabre.client.exception.ConfigureException;

/**
* @ClassName: Configuration
* @Description: Configuration
* @author Jason.ma
* @date 2013年10月18日 下午4:49:22
*/
public class Configuration {
	
	public String configName = "sabreclient.conf";
	
	private static Properties prop;
	
	/**
	 * 使用classpath中寻找configName方式
	 */
	public static void config(){
		InputStream is = null;
		Properties p = new Properties();
		try {
			is = Configuration.class.getClassLoader().getResourceAsStream("sabreclient.conf");
			p.load(is);
			Configuration.config(p);
		} catch (IOException e) {
			new ConfigureException("装置配置文件异常:",e);
		}finally{
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					new ConfigureException("装置配置文件异常:",e);
				}
			}
		}
	}
	
	public static void config(Properties prop){
		Configuration.prop = prop;
	}
	
	/**
	 * 读取配置信息
	 * @param key
	 * @return
	 */
	public static String getProperty(String key){
		return prop.getProperty(key);
	}

}
