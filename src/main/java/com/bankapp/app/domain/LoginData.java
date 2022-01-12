package com.bankapp.app.domain;

public class LoginData {

	 private String userName;
	    private String password;
	    
	    public LoginData() {}
	    
	    public LoginData(String userName, String pass) {
	        super();
	        this.userName = userName;
	        this.password = pass;
	    }
	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    @Override
	    public String toString() {
	        return "LoginData [uname=" + userName + ", pass=" + password + "]";
	    }
}
