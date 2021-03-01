package COM.API.Automation_RestAssured;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class Swagger {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setShipping(int shipping) {
		this.shipping = shipping;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setImage(String image) {
		this.image = image;
	}
	private String type;
	private int price;
	private int shipping;
	private String upc;
	private String description;
	private String manufacturer;
	private String model;
	private String url;
	private String image;



}
