package HttpServices;

import io.restassured.response.Response;

public class LoginService extends BaseService
{
    public Response LoginUser(Object Model)
    {
    	try
    	{
    	Response response=request.body(Model).post("/login");
    	return response;
    	}
    	catch (Exception e) {
    		System.out.println("Error while executing Login Request");
    		return null;
		}
    	
    }
}