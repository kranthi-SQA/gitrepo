package COM.API.Automation_RestAssured;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Apitest2 {
String bodypayload= "{\r\n" + 
		"  \"dashboard\": {\r\n" + 
		"    \"purchaseAmount\": 1162,\r\n" + 
		"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
		"  },\r\n" + 
		"  \"courses\": [\r\n" + 
		"    {\r\n" + 
		"      \"title\": \"Selenium Python\",\r\n" + 
		"      \"price\": 50,\r\n" + 
		"      \"copies\": 6\r\n" + 
		"    },\r\n" + 
		"    {\r\n" + 
		"      \"title\": \"Cypress\",\r\n" + 
		"      \"price\": 40,\r\n" + 
		"      \"copies\": 4\r\n" + 
		"    },\r\n" + 
		"    {\r\n" + 
		"      \"title\": \"RPA\",\r\n" + 
		"      \"price\": 45,\r\n" + 
		"      \"copies\": 10\r\n" + 
		"    },\r\n" + 
		"     {\r\n" + 
		"      \"title\": \"Appium\",\r\n" + 
		"      \"price\": 36,\r\n" + 
		"      \"copies\": 7\r\n" + 
		"    }\r\n" + 
		"    \r\n" + 
		"    \r\n" + 
		"    \r\n" + 
		"  ]\r\n" + 
		"}\r\n" + 
		"";









	
	@ Test
	public void validateresponse()
	
	{
		
		JsonPath path=new JsonPath(bodypayload);
		
		int size = path.getInt("courses.size()");
		
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
		int price=	path.getInt("courses.get("+i+").price");
		String title=path.getString("courses.get("+i+").title");
		
		System.out.println(price);
		System.out.println(title);			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
