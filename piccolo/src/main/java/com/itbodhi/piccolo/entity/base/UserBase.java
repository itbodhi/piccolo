package com.itbodhi.piccolo.entity.base;


public class UserBase {

	public String loginId;
	public String pasword;
	public String phone;
	public String type;
	public String confirm;
	public int id;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return pasword;
	}
	public void setPassword(String password) {
		this.pasword = password;
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
	
}