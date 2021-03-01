package COM.API.Automation_RestAssured;

import org.apache.http.client.utils.URLEncodedUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class JIRAAPI2 {



	@Test	
	public void getAllassignee() throws UnsupportedEncodingException

	{
		String sessid= BaseApi.getSessionid();
	     //   String url = URLEncoder.encode("jql=assignee=kranthi.kumar836@gmail.com","UTF-8");
	        
		String encodedurl = "jql=assignee=kranthi.kumar836@gmail.com"; // java.net class 
		String newurl = URLDecoder.decode(encodedurl, "UTF-8");  
		
		System.out.println(newurl);
	            
	
	           
		RestAssured.baseURI="http://localhost:8080";

		@SuppressWarnings("deprecation")
		String responsecode=	given().header("Content-type","application/json").header("Cookie","JSESSIONID="+sessid+"").log().all()
				.queryParam("jql",URLDecoder.decode("assignee=kranthi.kumar836"),"UTF-8").when()
				.get("/rest/api/2/search").then().extract().response().asString();
	//	System.out.println("The assignee response is " + responsecode);
		
		JsonPath path=new JsonPath(responsecode);
		
		System.out.println(path.getString("issues[0].key"));










	}









}
