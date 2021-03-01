/*package STEPDEFINITIONS;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;




import COM.API.TESTRUNNER.util;
import Resources.Addplacerequestpayload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class AddPlaceStepsApi extends util {
	RequestSpecification requestspec;
	Response response;
	String responseasstring;
	JsonPath jspath;
	Addplacerequestpayload addplacepayload =new Addplacerequestpayload();



	@Given("^Add place payload \"(.*?)\" \"(.*?)\"$")
	public void add_place_payload(int accuracy, String name) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		requestspec= specbuilder();
		requestspec=given().spec(requestspec).body(addplacepayload.addplacerequestpayload(accuracy,name)); // Write code here that turns the phrase above into concrete actions

	}



	@When("^User calls \"(.*?)\" with Post http request$")
	public void user_calls_with_Post_http_request(String arg1) throws Throwable {
		response=requestspec.when().post("/maps/api/place/add/json");	
		responseasstring = response.asString();
		System.out.println("Response is " + response.asString());
	}

	@Then("^Response statuscode should be \"(.*?)\"$")
	public void response_statuscode_should_be(String arg1) throws Throwable {
		System.out.println("Status code is" + response.getStatusCode());
		//		assertEquals(response.getStatusCode(),Integer.parseInt(arg1));
	}


	@Then("^Scope in reponsebody is \"(.*?)\"$")
	public void scope_in_reponsebody_is(String arg1) throws Throwable {
		jspath=new JsonPath(responseasstring);
		//assertEquals(jspath.getString("Scope"),arg1);
	}






}
*/