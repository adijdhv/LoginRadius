package ServiceModels;

public class RegisterModel extends BaseModel {
	public RegisterModel(String email, String password) 
	{
		this.email=email;
		this.password=password;

	}
	public String email;	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String password;
	
	

}