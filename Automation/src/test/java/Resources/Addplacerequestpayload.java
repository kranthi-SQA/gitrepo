package Resources;

import java.util.ArrayList;
import java.util.List;

import COM.API.RequestPojo.Addplace;
import COM.API.RequestPojo.location;

public class Addplacerequestpayload {


	Addplace addplace;
	location location;
	List<String>values;




	public Addplace addplacerequestpayload(int accuracy,String namee)
	{
		addplace=new Addplace();
		values=new ArrayList<String>();
		addplace.setAccuracy(accuracy);
		addplace.setName(namee);
		addplace.setPhone_number("(+91) 983 893 3937");
		location=new location();
		location.setLat(-38.383343);
		location.setLng(33.4234343);
		addplace.setLocation(location);
		values.add("shoe park");
		values.add("shop");
		addplace.setTypes(values);
		return addplace;
	}









}
