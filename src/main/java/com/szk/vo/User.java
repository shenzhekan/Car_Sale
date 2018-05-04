package com.szk.vo;
public class User {
	private String User_Id,            //用户id
				   Password,		   //密码
				   UserName;		   //用户名

	public User() {
		super();
	}
	

	public User(String user_Id, String password) {
		super();
		User_Id = user_Id;
		Password = password;
	}


	public User(String user_Id, String password, String userName) {
		super();
		User_Id = user_Id;
		Password = password;
		UserName = userName;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password == null ? null:password.trim();
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName ==null ? null:userName.trim();
	}

	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", Password=" + Password + ", UserName=" + UserName + "]";
	}


	
}
