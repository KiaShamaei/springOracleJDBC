package com.jpa.testjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
 private int id ;
@Column( nullable = false, length = 1000)
 private String firstName ;
 private String lastName ;
 private String address ;
public Employee(int id, String first_name, String last_name, String address) {
	super();
	this.id = id;
	this.firstName = first_name;
	this.lastName = last_name;
	this.address = address;
}

public Employee() {
	super();
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return firstName;
}
public void setFirst_name(String first_name) {
	this.firstName = first_name;
}
public String getLast_name() {
	return lastName;
}
public void setLast_name(String last_name) {
	this.lastName = last_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
