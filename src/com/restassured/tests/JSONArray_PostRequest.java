package com.restassured.tests;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class JSONArray_PostRequest {

	public static void main(String[] args) {
		try {
		JSONArray jsonArray = new JSONArray();
		jsonArray.put("Employee");

		JSONObject jo = new JSONObject();
		
			jo.put("name", "john");
		
		jo.put("age", "22");
		jo.put("city", "chicago");

		jsonArray.put(jo);

		 given().log().all().header("authorization", "Bearer 0431655cfe7ba40a791e0ce32d83ad33363348919c11627f409a3228f205e15f23")
				.accept(ContentType.JSON)
				.contentType("application/json")
				.and()
				.body(jsonArray.toString())
				.post("https://gorest.co.in/public-api/users")   //hit the post end point
				.thenReturn().asString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}


	}

}
