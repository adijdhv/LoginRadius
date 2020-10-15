package HttpServices;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import ServiceModels.*;
/**
 * Hello world!
 *
 */
public class RegisterServices  extends BaseService
{
    public Response RegisterUser(Object Model)
    {
    	try
    	{
    	Response response=request.body(Model).post("/register");
    	return response;
    	}
    	catch (Exception e) {
    		System.out.println("Error while executing Request");
    		return null;
		}
    	
    }
}
