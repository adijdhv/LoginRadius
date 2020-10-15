package HttpServices;

import io.restassured.response.Response;

public class UserService extends BaseService{

	public Response GetUsers()
    {
    	try
    	{
    	Response response=request.queryParam("page","2" ).get("/users");
    	return response;
    	}
    	catch (Exception e) {
    		System.out.println("Error while executing Get Users Request");
    		return null;
		}
    	
    }
	public Response GetSingleUser()
    {
    	try
    	{
    	Response response=request.get("/users/2");
    	return response;
    	}
    	catch (Exception e) {
    		System.out.println("Error while executing Get User Request");
    		return null;
		}
    	
    }
	public Response CreateUser(Object model)
    {
    	try
    	{
    	Response response=request.body(model).post("/users");
    	return response;
    	}
    	catch (Exception e) {
    		System.out.println("Error while executing Create User Request");
    		return null;
		}
    	
    }
	public Response GetDeletedUser()
    {
    	try
    	{
    	Response response=request.get("/users/23");
    	return response;
    	}
    	catch (Exception e) {
    		System.out.println("Error while executing Get Deleted User Request");
    		return null;
		}
    	
    }
}
