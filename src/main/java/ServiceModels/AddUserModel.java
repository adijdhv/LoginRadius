package ServiceModels;

public class AddUserModel {
	
	public AddUserModel(String Name,String Job)
	{
      this.job=Job;
      this.name=Name;
		
	}
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String job;
	
	public String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
