package com.restassured.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class MyPropKeys {

	public Properties prop = new Properties();

	public MyPropKeys() throws FileNotFoundException{

		InputStream is = new FileInputStream("C:\\eclipse-workspace\\RestAssured_Post\\info.properties");
		try {
			//            this.prop = new Properties();
			//            is = this.getClass().getResourceAsStream();
			prop.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Set<Object> getAllKeys(){
		Set<Object> keys = prop.keySet();
//		System.out.println(keys);
		return keys;

	}

	public String getPropertyValue(String key){
//		System.out.println(this.prop.getProperty(key));
		return this.prop.getProperty(key);
	}

//	public static void main(String a[]) throws FileNotFoundException{
//
//		MyPropKeys mpc = new MyPropKeys();
//		Set<Object> keys = mpc.getAllKeys();
//		for(Object k:keys){
//			String key = (String)k;
//			System.out.println(key+": "+mpc.getPropertyValue(key));
//		}
//	}
}