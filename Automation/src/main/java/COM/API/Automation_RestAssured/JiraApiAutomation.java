package COM.API.Automation_RestAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class JiraApiAutomation extends BaseApi {
	      
	
	                 

String jirabody="{\r\n" + 
		"    \"fields\": {\r\n" + 
		"       \"project\":\r\n" + 
		"       {\r\n" + 
		"          \"key\": \"AP\"\r\n" + 
		"       },\r\n" + 
		"       \"summary\": \"JIRA REST API AUTOMATION STORY\",\r\n" + 
		"       \"description\": \"Creating of an issue using API second time\",\r\n" + 
		"       \"issuetype\": {\r\n" + 
		"          \"name\": \"Bug\"\r\n" + 
		"       }\r\n" + 
		"   }\r\n" + 
		"}";	
	



@ Test
public void createIssue()
{
          String session=getSessionid();
	RestAssured.baseURI="http://localhost:8080";
	String responscode=given().header("Content-Type","application/json").header("Cookie","JSESSIONID="+session+"").body(jirabody)
	.when().post("/rest/api/2/issue").then().extract().response().asString();
	
	System.out.println("Response code is" + responscode);
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	

}
