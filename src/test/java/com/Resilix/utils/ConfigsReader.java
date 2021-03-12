package com.Resilix.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	private static Properties prop;


	public static void readProperties(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
