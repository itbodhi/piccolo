package com.itbodhi.piccolo.entity;

import com.itbodhi.piccolo.entity.base.SearchBase;

public class Search extends SearchBase{

	public String getEvent()
	{
		return this.event;
	}

	public String getAge()
	{
		return this.Age;
	}
	
	public String getLocation()
	{
		return this.location;
	}

	public void setEvent(String event)
	{
		 this.event = event;
	}

	public void setLocation(String location)
	{
		 this.location = location;
	}
	
	public void setAge(String age)
	{
		 this.Age = age;
	}
}
