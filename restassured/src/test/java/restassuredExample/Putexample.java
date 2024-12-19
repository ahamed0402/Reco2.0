package restassuredExample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putexample {
	
	@Test(enabled=false)
	public void editemployee()
	{
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification rs = RestAssured.given()
				.header("Content-type", "application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"Project manager\"\r\n"
						+ "}");
				
		Response response = rs.request(Method.PUT,"api/users/2");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusCode());
		
	}
	
	@Test
	public void bddputexample()
	{
		RestAssured.given()
		.baseUri("https://reqres.in/")
		.header("Content-Type", "application/json")
		.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"product OWNER\"\r\n"
						+ "}")
		.when()
		.put("api/users/2")
		.prettyPrint();
	}
}

