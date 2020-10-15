package TestCases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonUtilities.TestDataInitialize;
import HttpServices.UserService;
import ServiceModels.AddUserModel;
import ServiceModels.RegisterModel;
import ServiceModels.UserModel;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class UserTests extends TestBase {
	
	@Test
	public void GetUsers()
	{
		HashMap<String, String> map= new TestDataInitialize(new Exception().getStackTrace()[0].getMethodName()).Initialize();
		UserService service = new UserService();				
		UserModel response= service.GetUsers().getBody().as(UserModel.class);
		Assert.assertNotNull(response);
		}
		
	

@Test
public void GetSingleUser()
{
	HashMap<String, String> map= new TestDataInitialize(new Exception().getStackTrace()[0].getMethodName()).Initialize();
	UserService service = new UserService();		
	Response response= service.GetSingleUser();
    Assert.assertEquals(response.statusCode(), 200);

	}

@Test
public void CreateUser()
{
	HashMap<String, String> map= new TestDataInitialize(new Exception().getStackTrace()[0].getMethodName()).Initialize();
	AddUserModel model= new AddUserModel(map.get("Name"),map.get("Job"));

	UserService service = new UserService();				
	Response response= service.CreateUser(model);
	Assert.assertEquals(response.statusCode(), 201);
	}

@Test
public void GetUserNotAvailable()
{
	HashMap<String, String> map= new TestDataInitialize(new Exception().getStackTrace()[0].getMethodName()).Initialize();

	UserService service = new UserService();				
	Response response= service.GetDeletedUser();
	Assert.assertEquals(response.statusCode(), 404);
	}
	}
	



