package com.javaproject.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;





@Entity
@Table(name ="employees")
public class Employee {	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long id, String firstName, String lastname, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastname;
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_Name")
	private String firstName;
	@Column(name = "last_Name")
	private String lastName;
	@Column(name = "email_id",nullable = false, unique = true)
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
			

} 
