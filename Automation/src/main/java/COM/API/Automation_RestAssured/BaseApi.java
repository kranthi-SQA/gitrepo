package COM.API.Automation_RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class BaseApi {
	
	
	static String payload="{ \"username\": \"kranthi.kumar836\", \"password\": \"kranthikumar1\" }";
	static JsonPath path;
	

public static String getSessionid()
{
	
	RestAssured.baseURI="http://localhost:8080";
	
	String response=given().header("Content-Type","application/json").body(payload)
	.when().post("/rest/auth/1/session").then().extract().response().asString();
	path=new JsonPath(response);
	System.out.println("Response is " + response);
	String sessionid=path.getString("session.value");
	return sessionid;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
