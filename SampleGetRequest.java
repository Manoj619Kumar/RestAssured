package AssuredTraining;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {

	public static void main(String[] args) {
		
		Response response = RestAssured.get("www.google.co.in");
		
		int statusCode = response.statusCode();
		System.out.println(statusCode);
	}

}
