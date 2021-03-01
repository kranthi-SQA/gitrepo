package COM.API.MY_API_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Accountbalance implements Serializable {

	public int accbalance;	


	public Accountbalance(int accbalance)
	{

		this.accbalance=accbalance;	
	}


	public int getaccountbalance()
	{


		return accbalance;
	}

	public Object  readdata() throws IOException, ClassNotFoundException {

		FileInputStream fileStream = new FileInputStream(new File("C:\\Users\\C5300649\\Desktop\\MY\\folder1\\myfile.txt"));

		// Step 2: Create an object stream from the file stream. So that the content
		// of the file is converted to the Rectangle Object instance
		ObjectInputStream objectStream = new ObjectInputStream(fileStream);

		// Step 3: Read the content of the stream and convert it into object
		Object deserializeObject = objectStream.readObject();

		// Step 4: Close all the resources
		objectStream.close();
		fileStream.close();
		return deserializeObject;


	}












	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Accountbalance acc=new Accountbalance(790000);
		System.out.println(acc.getaccountbalance());

		FileOutputStream filestream =new FileOutputStream("C:\\Users\\C5300649\\Desktop\\MY\\folder1\\myfile.txt");
		ObjectOutputStream objectstream =new ObjectOutputStream(filestream);

		objectstream.writeObject(acc);
		objectstream.close();
		filestream.close();
		Accountbalance readingdata =(Accountbalance)acc.readdata();

		System.err.println(readingdata.getaccountbalance());



	}








}
