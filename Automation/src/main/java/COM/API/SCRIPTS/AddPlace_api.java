package COM.API.SCRIPTS;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import COM.API.RequestPojo.Addplace;
import COM.API.RequestPojo.location;
import COM.API.ResponsePojo.Addplaceresponsepojo;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddPlace_api {

	Addplace addplace;
	location location;
	List<String>values;






	@ Test
	public void Addplacapi()
	{
		addplace=new Addplace();
		values=new ArrayList<String>();
		addplace.setAccuracy(60);
		addplace.setName("Frontline house Streetline");
		addplace.setPhone_number("(+91) 983 893 3937");
		location=new location();
		location.setLat(-38.383496);
		location.setLng(33.427362);
		addplace.setLocation(location);
		values.add("shoe park");
		values.add("shop");

		addplace.setTypes(values);

		RestAssured.baseURI="https://rahulshettyacademy.com";
		RequestSpecification requstspec = given().log().all().queryParam("key","qaclick123");

		requstspec.body(addplace);
		Response res = requstspec.request(Method.POST,"/maps/api/place/add/json");
		
		Gson gson=new Gson();
	
		Addplaceresponsepojo myres = gson.fromJson(res.asString(),Addplaceresponsepojo.class);

		System.out.println("Id value is " + myres.getId());
		System.out.println(" Place is "  + myres .getPlace_id());
		System.out.println("Reference is  " + myres .getReference());
		System.out.println("Scope is" + myres .getScope());
		System.out.println("Status is" + myres .getStatus());



	}













}
