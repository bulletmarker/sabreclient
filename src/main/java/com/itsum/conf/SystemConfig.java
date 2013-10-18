package com.itsum.conf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Sabre服务相关配置管理类
 * @author Jason.Ma
 *
 */
public class SystemConfig {
	
	private static Properties prop = new Properties();
	
	private static final String defaultFilePath = "conf/supertour.conf";
	
	/** 使用默认配置文件初始化配置信息 **/
	public static void init(){
		File propFile = new File(defaultFilePath);
		if(propFile.exists()){
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(propFile);
				prop.load(fis);
			} catch (IOException e) {
				//TODO 转换为系统异常抛出
				e.printStackTrace();
			}
		}else{
			System.err.println("找不到系统配置文件 :" + propFile.getAbsolutePath());
		}
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
