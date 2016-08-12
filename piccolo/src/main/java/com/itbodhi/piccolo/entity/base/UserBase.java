package com.itbodhi.piccolo.entity.base;

public class UserBase {

	public String username;
	public String loginId;
	public String password;
	public String phone;
	public String type;
	public String confirm;
	public String address;
	public int id;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(int Id) {
		// TODO Auto-generated method stub
		this.id = Id;
	}
	public String getUserName() {
		// TODO Auto-generated method stub
		return username;
	}
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.username = userName;
	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.username = address;
	}
	
}