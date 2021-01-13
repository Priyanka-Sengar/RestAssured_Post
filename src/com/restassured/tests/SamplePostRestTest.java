package com.restassured.tests;

//Cannot serialize object because no JSON serializer found in classpath. Please put either Jackson (Databind) or Gson in the classpath.
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
public class SamplePostRestTest {

	public static void main(String[] args) {
		try {
		createUserDO cu = new createUserDO();
        cu.setName("Test Automation");
        cu.setGender("Female");
        cu.setEmail("testAutomation25@gmail.com");
        cu.setStatus("Active");
        
		String resp =  given().log().all().header("authorization", "Bearer 0431655cfe7ba40a791e0ce32d83ad33363348919c11627f409a3228f205e15f")
				.accept(ContentType.JSON)
				.contentType("application/json")
				.and()
				.body(cu)
				.post("https://gorest.co.in/public-api/users")   //hit the post end point
				.thenReturn().asString();
		
		System.out.println(resp);

	}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	

}
