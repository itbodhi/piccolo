package com.itbodhi.piccolo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="user", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})

public class Employee1
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id", nullable=false, unique=true,length=11)
  private int id;
  
  @Column(name="username", length=30, nullable=true)
  private String username;
  
  @Column(name="loginId" ,nullable=true)
  private String loginId;
  
  @Column(name="pasword", length=20, nullable=true)
  private String pasword;
  
  @Column(name="id", nullable=true,length=11)
  private int phone;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getLoginId() {
	return loginId;
}

public void setLoginId(String loginId) {
	this.loginId = loginId;
}

public String getPasword() {
	return pasword;
}

public void setPasword(String pasword) {
	this.pasword = pasword;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

}