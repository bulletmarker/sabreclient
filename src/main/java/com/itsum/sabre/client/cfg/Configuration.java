package com.itsum.sabre.client.cfg;

import java.io.File;
import java.net.URL;
import java.util.Properties;

/**
* @ClassName: Configuration
* @Description: Configuration
* @author Jason.ma
* @date 2013年10月18日 下午4:49:22
*/
public class Configuration {
	
	public String configName = "sabreclient.conf";
	
	/**
	 * 使用classpath中寻找configName方式
	 */
	public static void config(){
		URL configUrl = Configuration.class.getClassLoader().getResource("sabreclient.conf");
	}
	
	public static void config(String path){
		File propFile = new File(path);
	}
	
	public static void config(Properties prop){
		
	}

}
