package AssuredTraining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequestPractice {
	
	@Test
	public void postRequestExample() {
		
		
		JSONObject jsonObject = new JSONObject();//need to create a obj for json
		jsonObject.put("name", "agni");
		jsonObject.put("job", "athibar");
		
		System.out.println(jsonObject.toString()); //if it is an oblect it will not run so need to convert into toString

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.given().header(" "," ").body(jsonObject.toJSONString()).post("/api/users").then().statusCode(201);
		
		
	}

}
