package TestCases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonUtilities.TestDataInitialize;
import HttpServices.LoginService;
import ServiceModels.RegisterModel;
import io.restassured.response.Response;

public class LoginTests extends TestBase {
	
	@Test
	public void LoginTest()
	{
		HashMap<String, String> map= new TestDataInitialize(new Exception().getStackTrace()[0].getMethodName()).Initialize();
		RegisterModel model= new RegisterModel(map.get("Email"),map.get("Password"));
		LoginService service = new LoginService();
		Response response= service.LoginUser(model);
		int str= response.getStatusCode();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
}
