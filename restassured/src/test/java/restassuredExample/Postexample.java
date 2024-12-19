package restassuredExample;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postexample {
	
	@Test(enabled=false)
	public void createemployee()
	{
		
		RestAssured.baseURI= "https://reqres.in/";
		
		RequestSpecification rs = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
				
		
		Response response = rs.request(Method.POST,"api/users");
		
		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
		
	}

	
	
	@Test
	public void bddpostexample()
	{
		
	given()
		.baseUri("https://reqres.in/")
		.header("Content-Type","application/json")
		.body("{\r\n"
		+ "    \"name\": \"ahamed\",\r\n"
		+ "    \"job\": \"test engineer\"\r\n"
		+ "}")
		.when()
		.post("api/users")
		.prettyPrint();

	}
}
