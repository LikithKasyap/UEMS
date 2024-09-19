package com.kl.ep.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registrations_table")
public class EventsRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int refid;
	//private int eventid;
	private int studentid;
	private String name;
	  private String venue;
	  private String department;
	  private String date;
	  private String details; 
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
	

}
