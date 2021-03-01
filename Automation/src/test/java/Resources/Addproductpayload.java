package Resources;

import COM.API.Automation_RestAssured.Swagger;

public class Addproductpayload {




	public static Swagger getproductpayload()
	{

		Swagger swag=new Swagger();
		swag.setName("Mobile shops");
		swag.setDescription("Adding product from api");
		swag.setImage("One.jpg");
		swag.setManufacturer("India");
		swag.setModel("Latest");
		swag.setPrice(450);
		swag.setShipping(700);
		swag.setUpc("upc");
		swag.setUrl("Google.com");
		swag.setType("New type");


		return swag;	
	}











}
