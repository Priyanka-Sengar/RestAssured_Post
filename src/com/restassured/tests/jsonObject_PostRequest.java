package com.restassured.tests;

import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
public class jsonObject_PostRequest {

	public static void main(String[] args) throws IOException {
		try {
			InputStream input=new FileInputStream("C:\\eclipse-workspace\\RestAssured_Post\\info.properties");
			// TODO Auto-generated method stub
			Properties p=new Properties();
			p.load(input);
			MyPropKeys mpc = new MyPropKeys();
			Set<Object> keys = mpc.getAllKeys();

			JSONObject jsonObject = new JSONObject();
			for(Object k:keys){
				String key = (String)k;
				jsonObject.put(key, mpc.getPropertyValue(key));
				jsonObject.put(key, mpc.getPropertyValue(key));
				jsonObject.put(key, mpc.getPropertyValue(key));
				jsonObject.put(key, mpc.getPropertyValue(key));
			
			}

			String resp=  given().log().all().header("authorization", "Bearer 0431655cfe7ba40a791e0ce32d83ad33363348919c11627f409a3228f205e15f23")
			
					.accept(ContentType.JSON)
					.contentType("application/json")
					.and()
					.body(jsonObject.toString())
					.post("https://gorest.co.in/public-api/users")   //hit the post end point
					.thenReturn().asString();

			System.out.println(resp);


		} catch (JSONException e) {
			System.out.println(e.getMessage());
		}
	}

}
