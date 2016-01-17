package com.sample.demo2.models;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8818329559130560677L;

	/**
	 * 
	 */
	
	public Employee(){
		
	}
	
	public Employee(int employeeId, String name, String telephone) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.telephone = telephone;
	}

	private int employeeId;
	private String name;
	private String telephone;
	private Address address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", telephone=" + telephone + ", address="
				+ address + "]";
	}

	

	
	
}
