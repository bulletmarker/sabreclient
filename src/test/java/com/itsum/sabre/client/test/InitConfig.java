package com.itsum.sabre.client.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.itsum.sabre.client.cfg.Configuration;

/**
 * 
* @ClassName: InitConfig
* @Description: 初始化配置信息
* @author Jason.ma
* @date 2013年10月21日 上午10:02:43
*/
public class InitConfig {
	
	public static void init() throws IOException{
		File f = new File("conf/supertour.conf");
		Properties p = new Properties();
		InputStream is = null;
		try{
			is = new FileInputStream(f);
			p.load(is);
			Configuration.config(p);
		}finally{
			if(is != null){
				is.close();
			}
		}
	}

}
