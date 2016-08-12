package com.itbodhi.piccolo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.itbodhi.piccolo.entity.base.UserBase;

@Table(name="user")  
@Entity
public class User extends UserBase{

	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true,length=11)
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int Id) {
		// TODO Auto-generated method stub
		super.setId(Id);
	}
	
	@Override
	@Column(name="username", length=30, nullable=true) 
	public String getUserName() {
		// TODO Auto-generated method stub
		return super.getUserName();
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		super.setUserName(userName);
	}
	
	@Override
	@Column(name="loginId", length=50, nullable=true) 
	public String getLoginId() {
		// TODO Auto-generated method stub
		return super.getLoginId();
	}

	@Override
	public void setLoginId(String loginId) {
		// TODO Auto-generated method stub
		super.setLoginId(loginId);
	}

	@Override
	@Column(name="pasword", length=20, nullable=true) 
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	@Override
	@Column(name="phone", length=11, nullable=true) 
	public String getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}

	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}

	@Override
	@Column(name="userType", length=10, nullable=true) 
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	@Column(name="confirmpass", length=20, nullable=true) 
	public String getConfirm() {
		// TODO Auto-generated method stub
		return super.getConfirm();
	}

	@Override
	public void setConfirm(String confirm) {
		// TODO Auto-generated method stub
		super.setConfirm(confirm);
	}
	
	@Override
	@Column(name="address", length=20, nullable=true) 
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

}
