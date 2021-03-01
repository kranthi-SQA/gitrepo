package COM.API.Automation_RestAssured;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class swaggerreponse {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("price")
	@Expose
	private Integer price;
	@SerializedName("shipping")
	@Expose
	private Integer shipping;
	@SerializedName("upc")
	@Expose
	private String upc;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("manufacturer")
	@Expose
	private String manufacturer;
	@SerializedName("model")
	@Expose
	private String model;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("image")
	@Expose
	private String image;
	@SerializedName("updatedAt")
	@Expose
	private String updatedAt;
	@SerializedName("createdAt")
	@Expose
	private String createdAt;

	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public String getType() {
		return type;
	}


	public Integer getPrice() {
		return price;
	}



	public Integer getShipping() {
		return shipping;
	}


	public String getUpc() {
		return upc;
	}



	public String getDescription() {
		return description;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public String getModel() {
		return model;
	}


	public String getUrl() {
		return url;
	}



	public String getImage() {
		return image;
	}


	public String getUpdatedAt() {
		return updatedAt;
	}


	public String getCreatedAt() {
		return createdAt;
	}

}