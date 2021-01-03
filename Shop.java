public class Shop extends Admin{
	private String name;
	private String phoneNum;
	private String status;
	private String manager;
	
	public class Shop(){
	}
	
	public class Shop(String name, String phoneNum, String status, String manager){
		this.name = name;
		this.phoneNum = phoneNum;
		this.status = status;
		this.manager = manager;
	}
	
	public String getShopname(){
		return name;
	}
	
	public String getShopphone(){
		return phoneNum;
	}
	
	public String getShopstatus(){
		return status;
	}
	
	public String getManager(){
		return manager;
	}
	
	public void setShopname(String name){
		this.name = name;
	}
	
	public void setShopphone(String phoneNum){
		this.phoneNum = phoneNum;
	}
	
	public void setShopstatus(String status){
		this.status = status;
	}
	
	public void setManager(){
		this.manager = manager;
	}
}
