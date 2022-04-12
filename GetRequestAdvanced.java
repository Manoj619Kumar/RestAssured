package AssuredTraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class GetRequestAdvanced {
	private ValidatableResponse statusCode;
	@Test
	public void getTequest() {
	Response response = RestAssured.get("https://reqres.in/api/users/2");
	//below step say to get a body from the URL
	ResponseBody body = response.getBody(); //response.body() we can use both methods for to get body
	//System.out.println(body);
	//If we need a human readable format we can use asString() or asPrettyString().
	System.out.println(body.asPrettyString()); //asString() will give the body in a line & asPrettyString() will give o/p in json format 
	
	}
	@Test
	public void newGe() {
		RestAssured.baseURI="https://reqres.in/api/users";
		Response response3 = RestAssured.given().param("", "").header("","").when().get("/users/3");
		//ValidatableResponse validatableResponse = RestAssured.given().param("", "").header("","").when().get("/users/3").then().statusCode(200); //when we r using then we must put validatable response
		System.out.println(response3.asPrettyString());

	}

}
