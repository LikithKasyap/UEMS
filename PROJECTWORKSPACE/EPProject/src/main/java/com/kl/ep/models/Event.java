package com.kl.ep.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_table")
public class Event
{
	@Id
	  private int id;
	@Column(name="ename",nullable=false,length=50)
	  private String name;
	  @Column(name="evenue",nullable=false,length=10)
	  private String venue;
	  @Column(name="edepartment",nullable=false,length=50)
	  private String department;
	  @Column(name="edate",nullable = false,length=50)
	  private String date;
	  @Column(name="edetails",nullable=false,length=70)
	  private String details;
	  
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
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEdetails() {
		return details;
	}
	public void setEdetails(String details) {
		this.details = details;
	}
	
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", venue=" + venue + ", department=" + department + ", date="
				+ date + ", details=" + details + "]";
	}
	
}
