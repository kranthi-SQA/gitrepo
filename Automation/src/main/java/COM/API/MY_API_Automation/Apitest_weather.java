package COM.API.MY_API_Automation;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Apitest_weather {


	/*@Test
	public void getweatherdetails()

	{


		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestspec = RestAssured.given();
		Response response = requestspec.request(Method.GET,"/Hyderabad");

		ResponseBody body = response.getBody();
		Deserilable values = body.as(Deserilable.class);

		Assert.assertEquals("Hyderabad",values.City);
		Assert.assertEquals("36 Degree celsius",values.Temperature);
		Assert.assertEquals("39 Percent",values.Humidity);
		Assert.assertEquals("scattered clouds",values.WeatherDescription);
		Assert.assertEquals("2.1 Km per hour",values.WindSpeed);
		Assert.assertEquals("160 Degree",values.WindDirectionDegree);



		System.out.println(body);
		//		return body;

		//		int statuscode = response.getStatusCode();
		//		Assert.assertEquals(200,statuscode);

		//	System.out.println(" The reponse is " + response.getBody().asString());
		//		String reponsebodystring = response.getBody().asString();
		//		Assert.assertEquals(reponsebodystring.contains("City"),true);


		//		JsonPath path =new JsonPath(reponsebodystring);

		//	System.out.println(path.get("City"));


	}
	 */

	/*	@Test
	public void testapi()
	{

		RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";

		RequestSpecification requestspec = RestAssured.given();
		requestspec.queryParam("q","London,UK");
		requestspec.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8");

		Response response = requestspec.request(Method.GET,"/weather");

		JsonPath path =new JsonPath(response.asString());

		System.out.println(path.get("coord.lon"));

		System.out.println(response.asString());
	}
	 */

	/*	@Test
	public void testapi()
	{


		RestAssured.baseURI="http://restapi.demoqa.com/customer";

		RequestSpecification requestspec = RestAssured.given();
		requestspec.header("Content-Type", "application/json");

		JSONObject jsonobject=new JSONObject();

		jsonobject.put("FirstName", "Virender1"); 
		jsonobject.put("LastName", "Singh1");
		jsonobject.put("UserName", "simpleuser1001");
		jsonobject.put("Password", "password11");
		jsonobject.put("Email",  "someuse1r@gmail.com");
		requestspec.body(jsonobject.toString());

		Response response = requestspec.request(Method.POST,"/register");

		System.out.println(response.asString());





	}
	 */

	@Test
	public void validatejsonpath()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/books/getallbooks";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("");
		    JsonPath path=new JsonPath(response.asString());
		  
		    
		 System.out.println(response.asString());

		String body="{\r\n" + 
				"  \"books\": [\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781593275846\",\r\n" + 
				"      \"title\": \"Eloquent JavaScript, Second Edition\",\r\n" + 
				"      \"subtitle\": \"A Modern Introduction to Programming\",\r\n" + 
				"      \"author\": \"Marijn Haverbeke\",\r\n" + 
				"      \"published\": \"2014-12-14T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"No Starch Press\",\r\n" + 
				"      \"pages\": 472,\r\n" + 
				"      \"description\": \"JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale applications.\",\r\n" + 
				"      \"website\": \"http://eloquentjavascript.net/\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781449331818\",\r\n" + 
				"      \"title\": \"Learning JavaScript Design Patterns\",\r\n" + 
				"      \"subtitle\": \"A JavaScript and jQuery Developer's Guide\",\r\n" + 
				"      \"author\": \"Addy Osmani\",\r\n" + 
				"      \"published\": \"2012-07-01T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"O'Reilly Media\",\r\n" + 
				"      \"pages\": 254,\r\n" + 
				"      \"description\": \"With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.\",\r\n" + 
				"      \"website\": \"http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781449365035\",\r\n" + 
				"      \"title\": \"Speaking JavaScript\",\r\n" + 
				"      \"subtitle\": \"An In-Depth Guide for Programmers\",\r\n" + 
				"      \"author\": \"Axel Rauschmayer\",\r\n" + 
				"      \"published\": \"2014-02-01T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"O'Reilly Media\",\r\n" + 
				"      \"pages\": 460,\r\n" + 
				"      \"description\": \"Like it or not, JavaScript is everywhere these days-from browser to server to mobile-and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who once found himself in the same position.\",\r\n" + 
				"      \"website\": \"http://speakingjs.com/\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781491950296\",\r\n" + 
				"      \"title\": \"Programming JavaScript Applications\",\r\n" + 
				"      \"subtitle\": \"Robust Web Architecture with Node, HTML5, and Modern JS Libraries\",\r\n" + 
				"      \"author\": \"Eric Elliott\",\r\n" + 
				"      \"published\": \"2014-07-01T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"O'Reilly Media\",\r\n" + 
				"      \"pages\": 254,\r\n" + 
				"      \"description\": \"Take advantage of JavaScript's power to build robust web-scale or enterprise applications that are easy to extend and maintain. By applying the design patterns outlined in this practical book, experienced JavaScript developers will learn how to write flexible and resilient code that's easier-yes, easier-to work with as your code base grows.\",\r\n" + 
				"      \"website\": \"http://chimera.labs.oreilly.com/books/1234000000262/index.html\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781593277574\",\r\n" + 
				"      \"title\": \"Understanding ECMAScript 6\",\r\n" + 
				"      \"subtitle\": \"The Definitive Guide for JavaScript Developers\",\r\n" + 
				"      \"author\": \"Nicholas C. Zakas\",\r\n" + 
				"      \"published\": \"2016-09-03T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"No Starch Press\",\r\n" + 
				"      \"pages\": 352,\r\n" + 
				"      \"description\": \"ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that ECMAScript 6 brings to JavaScript.\",\r\n" + 
				"      \"website\": \"https://leanpub.com/understandinges6/read\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781491904244\",\r\n" + 
				"      \"title\": \"You Don't Know JS\",\r\n" + 
				"      \"subtitle\": \"ES6 & Beyond\",\r\n" + 
				"      \"author\": \"Kyle Simpson\",\r\n" + 
				"      \"published\": \"2015-12-27T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"O'Reilly Media\",\r\n" + 
				"      \"pages\": 278,\r\n" + 
				"      \"description\": \"No matter how much experience you have with JavaScript, odds are you don’t fully understand the language. As part of the 'You Don’t Know JS' series, this compact guide focuses on new features available in ECMAScript 6 (ES6), the latest version of the standard upon which JavaScript is built.\",\r\n" + 
				"      \"website\": \"https://github.com/getify/You-Dont-Know-JS/tree/master/es6%20&%20beyond\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781449325862\",\r\n" + 
				"      \"title\": \"Git Pocket Guide\",\r\n" + 
				"      \"subtitle\": \"A Working Introduction\",\r\n" + 
				"      \"author\": \"Richard E. Silverman\",\r\n" + 
				"      \"published\": \"2013-08-02T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"O'Reilly Media\",\r\n" + 
				"      \"pages\": 234,\r\n" + 
				"      \"description\": \"This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git experience.\",\r\n" + 
				"      \"website\": \"http://chimera.labs.oreilly.com/books/1230000000561/index.html\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781449337711\",\r\n" + 
				"      \"title\": \"Designing Evolvable Web APIs with ASP.NET\",\r\n" + 
				"      \"subtitle\": \"Harnessing the Power of the Web\",\r\n" + 
				"      \"author\": \"Glenn Block, et al.\",\r\n" + 
				"      \"published\": \"2014-04-07T00:00:00.000Z\",\r\n" + 
				"      \"publisher\": \"O'Reilly Media\",\r\n" + 
				"      \"pages\": 538,\r\n" + 
				"      \"description\": \"Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft’s ASP.NET Web API framework. In the process, you’ll learn how design and implement a real-world Web API.\",\r\n" + 
				"      \"website\": \"http://chimera.labs.oreilly.com/books/1234000001708/index.html\"\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";


	                   



	}

















}
