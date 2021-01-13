//package RestAssured_Post;
//
//public class RestAssured_Post {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

package com.restassured.tests;

import io.restassured.http.*;
import org.apache.http.HttpStatus;
//import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class PostMethodTest {

 
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	// Json Body to pass in the request
        String jsonBody = "{" +
                "   \"name\":\"Test Automation\",\n" +
                "   \"gender\":\"Male\",\n" +
                "   \"email\":\"testAutomation3@gmail.com\",\n" +
                "   \"status\":\"Active\"\n" +
                "}";

        given().header("authorization", "Bearer 0431655cfe7ba40a791e0ce32d83ad33363348919c11627f409a3228f205e15f")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .post("https://gorest.co.in/public-api/users")   //hit the post end point
                .then().
                assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("data.name", equalTo("Test Automation")); // Match the output actual to expected
	}
}
