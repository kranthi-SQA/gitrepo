package STEPDEFINITIONS;

import static io.restassured.RestAssured.given;

import Resources.Addproductpayload;
import Resources.util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Addproductsteps  extends util{
	String idvalue =null;

	RequestSpecification requestspec;

	@Given("^payload for adding a product$")
	public void payload_for_adding_a_product() throws Throwable {
		requestspec= specbuilder();
		requestspec= given().spec(requestspec).body(Addproductpayload.getproductpayload());





	}

	@When("^Hit api with http  request \"(.*?)\" method$")
	public void hit_api_with_http_request_method(String requestmethod) throws Throwable {
		String response = null;
		// Write code here that turns the phrase above into concrete actions
		if(requestmethod.equalsIgnoreCase("Post"))
			response=requestspec.when().post("/products").asString();
		JsonPath path =new JsonPath(response);
		idvalue=path.getString("Id");
		System.out.println("Responsse is " + response);
	}



	@When("^validate prouduct is added or not with get request method$")
	public void validate_prouduct_is_added_or_not_with_get_request_method() throws Throwable {


		hit_api_with_http_request_method("get");





	}


















}
