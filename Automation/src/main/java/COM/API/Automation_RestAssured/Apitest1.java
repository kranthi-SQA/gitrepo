package COM.API.Automation_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;





public class Apitest1 {



	@Test
	public void testapi()
	{
		String payload="{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Frontline house\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout,Inida 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";	

		RestAssured.baseURI="https://rahulshettyacademy.com";
String responsebody=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload)
		.when()
		.post("/maps/api/place/add/json")
		.then().log().all()
		.assertThat().statusCode(200).body("status",equalTo("OK"))
		.extract().response().asString();

System.out.println("*** The response is ****" + responsebody);

JsonPath path=new JsonPath(responsebody);
Object placeid = path.get("place_id");

System.out.println("Plac id is " + placeid);

		
	
	   /* System.out.println(responsepayload.getStatusCode());
	    System.out.println("Response payload is" + responsepayload.asString());*/
	







	}






}
