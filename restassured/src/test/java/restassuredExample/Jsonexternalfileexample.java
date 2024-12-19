package restassuredExample;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Jsonexternalfileexample {
	
	@Test
	public void createemployee()
	{

		File filejson = new File("postdata.json");
		RestAssured.given()
		.baseUri("https://reqres.in/")
		.header("Content-Type","application/json")
		.body(filejson)
		.when()
		.post("api/users")
		.prettyPrint();
		
	}

}
