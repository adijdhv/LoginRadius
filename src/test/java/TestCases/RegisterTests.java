package TestCases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonUtilities.TestDataInitialize;
import HttpServices.RegisterServices;
import ServiceModels.RegisterModel;
import io.restassured.response.Response;

public class RegisterTests extends TestBase{
	
	
	@Test
	public void RegisterTest()
	{
		HashMap<String, String> map= new TestDataInitialize(new Exception().getStackTrace()[0].getMethodName()).Initialize();
		RegisterModel model= new RegisterModel(map.get("Email"),map.get("Password"));
		RegisterServices service = new RegisterServices();
		Response response= service.RegisterUser(model);
		int str= response.getStatusCode();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
