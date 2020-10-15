package HttpServices;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	RequestSpecification request;
	  public BaseService() {

			try
			{
			File f = new File("C:\\Users\\grawat\\Workspace\\DemoAPIProject\\src\\main\\java\\CommonUtilities\\Config.Properties");
			FileInputStream stream= new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(stream);
			RestAssured.baseURI = prop.getProperty("BaseUrl");
			RestAssured.basePath="api";
			request = given();  
	    	request.header("Content-Type", "application/json");   			}
			catch (FileNotFoundException e) {
				System.out.print("File Not Available");
			}
			catch (IOException e) {
				System.out.print("File Not Available");
			}	}
	 

		


}
