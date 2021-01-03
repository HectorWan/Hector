public class Customer extends Admin{
		private String name;
		private String phoneNum;
		private String status;
		
		public Customer(){
		}
		
		public Customer(String name, String phoneNum, String status ){
			this.name = name;
			this.phoneNum = phoneNum;
			this.status = status;
		}
	
		public String getCustomerName(){
			return name;
		}
		
		public String getCustomerPhonenum(){
			return phoneNum;
		}
		
		public String getCustomerStatus(){
			return status;
		}
		
		public void setCustomerName(String name){
			this.name = name;
		}
		
		public void setCustomerPhonenum(String phoneNum){
			this.phoneNum = phoneNum;
		}
		
		public void setCustomerStatus(String status){
			this.status = status;
		}
		
		public String toString(){
			return "Name: " + getName() + "\nPhone Number: " + getCustomerPhonenum() + "\nStatus: " + getCustomerStatus();
		}
}
