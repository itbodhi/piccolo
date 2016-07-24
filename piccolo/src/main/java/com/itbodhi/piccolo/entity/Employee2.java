package com.itbodhi.piccolo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="contactus",uniqueConstraints={@UniqueConstraint(columnNames={"ID"})}	)
public class Employee2{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="fname", length=20, nullable=true)
	private String name;
	
	@Column(name="email", length=20,nullable=true)
	private String email;
	
	@Column(name="choose",nullable=true)
	private String type;
	
	@Column(name="phone", length=20,nullable=true)
	private int phone;

	@Column(name="equery", length=20,nullable=true)
	private String query;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	//getter and setter methods.
	
	}
