package ServiceModels;

import java.util.ArrayList;

public class UserModel {
	
	public String page;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public ArrayList<UserData> getData() {
		return data;
	}
	public void setData(ArrayList<UserData> data) {
		this.data = data;
	}
	public String per_page;
	public String total;
	public String total_pages;
	public ArrayList<UserData> data;
	public UsersAD ad;
	
	
}
 