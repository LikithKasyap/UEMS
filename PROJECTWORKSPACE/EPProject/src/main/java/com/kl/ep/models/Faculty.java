package com.kl.ep.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_table")
public class Faculty implements Serializable 
{
  @Id
  private int id;
  @Column(name="fname",nullable=false,length=50)
  private String name;
  @Column(name="fgender",nullable=false,length=10)
  private String gender;
  @Column(name="fdepartment",nullable=false,length=50)
  private String department;
  @Column(name="fsalary",nullable = false,precision = 10,scale = 4)
  private double salary;
  @Column(name="femail",nullable=false,length=50,unique=true)
  private String email;
  @Column(name="fpassword",nullable=false,length=50)
  private String password;
  @Column(name="fcontact",nullable=false,length=20,unique=true)
  private String contact;
  
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

@Override
public String toString() {
	return "Faculty [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", salary="
			+ salary + ", email=" + email + ", password=" + password + ", contact=" + contact + "]";
}
  
}
