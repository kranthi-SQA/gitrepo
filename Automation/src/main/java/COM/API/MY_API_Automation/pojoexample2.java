package COM.API.MY_API_Automation;

import java.util.List;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class pojoexample2 {

	/*	private  List<accounting> accounting;
	private  List<sales> sales;
	public List<accounting> getAccounting() {
		return accounting;
	}
	public void setAccounting(List<COM.API.MY_API_Automation.accounting> accounting) {
		this.accounting = accounting;
	}
	public List<COM.API.MY_API_Automation.sales> getSales() {
		return sales;
	}
	public void setSales(List<COM.API.MY_API_Automation.sales> sales) {
		this.sales = sales;
	}
	 */


	@Test
	public void addplace()
	{


		RestAssured.baseURI="https://rahulshettyacademy.com";
		RequestSpecification requstspec = given().queryParam("key","qaclick123");

		String  body="{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Frontline house\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
		requstspec.body(body);
		Response response = requstspec.request(Method.POST,"/maps/api/place/add/json");
		System.out.println(response.asString());









	}





}
