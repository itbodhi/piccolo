package com.itbodhi.piccolo.entity;

import com.itbodhi.piccolo.entity.base.ViewBase;

public class View extends ViewBase{

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