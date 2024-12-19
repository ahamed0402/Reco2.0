package restassuredExample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getexample {

	@Test(enabled=false)
	public void allemployees() {

		RestAssured.baseURI = "https://reqres.in/";
	
		RequestSpecification rs = RestAssured.given();
		
		Response response = rs.request(Method.GET,"api/users/2");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}
	
	
	
	@Test
	public void bddallemployees()
	{
		
		RestAssured.given()
		.baseUri("https://reqres.in/")
		.when()
		.get("api/users/")
		.prettyPrint();
		
	}
}
