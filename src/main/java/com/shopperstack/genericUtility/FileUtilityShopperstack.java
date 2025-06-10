package com.shopperstack.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilityShopperstack {
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis =new FileInputStream("./src/test/resources/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	

}
