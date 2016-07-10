package com.itbodhi.piccolo.entity;

import com.itbodhi.piccolo.entity.base.UserBase;

public class User extends UserBase{

	public String getLoginId()
	{
		return this.loginId;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setLoginId(String loginId)
	{
		 this.loginId = loginId;
	}

	public void setPassword(String password)
	{
		 this.password = password;
	}
}
