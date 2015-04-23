package test;

public class User {
	String userName; //(full name)
	String userSignOn; //(mdnelson)
	String userPassword;
	int admin; //boolean value- 0 no admin; 1 admin
	
	public User(String userName, String userSignOn, String userPassword, int admin){
		this.userName = userName;
		this.userSignOn = userSignOn;
		this.userPassword = userPassword;
		this.admin = admin;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSignOn() {
		return userSignOn;
	}
	public void setUserSignOn(String userSignOn) {
		this.userSignOn = userSignOn;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	public String toString(){
		return userName + " " + userSignOn + " " + userPassword + " " + admin;
	}
	
	

}
