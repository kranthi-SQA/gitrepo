package COM.API.RequestPojo;

import java.util.List;

public class Addplace {
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private location location;
	private List<String> types;


	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public COM.API.RequestPojo.location getLocation() {
		return location;
	}
	public void setLocation(COM.API.RequestPojo.location location) {
		this.location = location;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
















}
