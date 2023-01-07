package com.admin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;


@Entity
@Table(name = "admin_user")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="project_name")
	private String project_name;
	
	@Column(name="start_date")
	private String start_date;
	

	@Column(name="end_date")
	private String end_date;
	
	@Column(name="project_status")
	private String project_status;
	

	
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
	
	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getProject_status() {
		return project_status;
	}

	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}

	public Admin() {
		
	}

	public Admin(String name, String email, String project_name, String start_date, String end_date, String project_status) {
		super();
//		this.id = id;
		this.name = name;
		this.email = email;
		this.project_name = project_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.project_status = project_status;
	}
//
//	public Admin(String firstname, String lastname, String email) {
//		super();
//		this.name = firstname;
//		this.lastname = lastname;
//		this.email = email;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public String getFirstname() {
//		return firstname;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}

}
