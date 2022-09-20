package com.greatlerning.itsupport;

public class Employee {
	public String firstName;
	public String lastName;
	public String email;
	private String password;
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
