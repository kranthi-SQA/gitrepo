package Resources;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;



public class util {


	RequestSpecification requestspecfication;
	PrintStream stream;

	public RequestSpecification specbuilder() throws FileNotFoundException
	{
		stream =new PrintStream(new FileOutputStream("Logs.txt"));
		requestspecfication=new RequestSpecBuilder().setBaseUri("http://localhost:3030")
				.setContentType(io.restassured.http.ContentType.JSON)
				.addFilter(RequestLoggingFilter.logRequestTo(stream))
				.addFilter(ResponseLoggingFilter.logResponseTo(stream))
				.build();

		/*RequestSpecification request = given().spec(requestspecfication).body(addplace);
		Response response = request.when().post("maps/api/place/add/json");*/
		//	System.out.println(response.asString());

		return requestspecfication;


	}














}
