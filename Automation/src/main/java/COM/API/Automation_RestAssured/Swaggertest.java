package COM.API.Automation_RestAssured;

import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Swaggertest {




	@Test
	public void testapi()
	{
		RequestSpecification requestspecficatiion = new RequestSpecBuilder().setBaseUri("http://localhost:3030").setContentType(io.restassured.http.ContentType.JSON)
				.build();

		Swagger swag=new Swagger();
		swag.setName("Mobile shops");
		swag.setDescription("Adding product from api");
		swag.setImage("One.jpg");
		swag.setManufacturer("India");
		swag.setModel("Latest");
		swag.setPrice(450);
		swag.setShipping(700);
		swag.setUpc("upc");
		swag.setUrl("Google.com");
		swag.setType("New type");


		requestspecficatiion = given().spec(requestspecficatiion).body(swag);
		swaggerreponse swaggerresponse = requestspecficatiion.when().post("/products").as(swaggerreponse.class);

		System.out.println("Response is " + swaggerresponse.getName());
		System.out.println(swaggerresponse.getCreatedAt());
		System.out.println(swaggerresponse.getDescription());
		System.out.println(swaggerresponse.getManufacturer());
		System.out.println(swaggerresponse.getModel());
		System.out.println(swaggerresponse.getId());

	}



	@Test
	public void testapi1()
	{

		RestAssured.baseURI = "http://restapi.demoqa.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/utilities/books/getallbooks");	

		JsonPath responsepath = response.jsonPath();


		List<String> allBooks = responsepath.getList("books.title");

		// Iterate over the list and print individual book item
		for(String book : allBooks)
		{
			System.out.println("Book: " + book);
		}






	}














	String body="{\r\n" + 
			"  \"name\": \"Capability_e2e${__RandomString(3,abcdefghijklmnopqrstuvwxyz012345789,capid)}\",\r\n" + 
			"  \"properties\": [\r\n" + 
			"    {\r\n" + 
			"      \"name\": \"Temperature\",\r\n" + 
			"      \"dataType\": \"Integer\",\r\n" + 
			"      \"unitOfMeasure\": \"Cel\",\r\n" + 
			"      \"formatter\": {\r\n" + 
			"        \"dataType\": \"Integer\",\r\n" + 
			"        \"scale\": 0,\r\n" + 
			"        \"shift\": 0,\r\n" + 
			"        \"swap\": false\r\n" + 
			"      }\r\n" + 
			"    }\r\n" + 
			"  ]\r\n" + 
			"}";


















}
