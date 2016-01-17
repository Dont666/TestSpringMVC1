package com.sample.demo2.models;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 实现一个serialVersionUID属性
	 */
	private static final long serialVersionUID = -8823582814529610607L;
	/**
	 * 
	 */
	
	private String country;
	private String state;
	private String zipcode;
	private String city;
	public Address() {
	}
	public Address(String country, String state, String zipcode, String city) {
		super();
		this.country = country;
		this.state = state;
		this.zipcode = zipcode;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", zipcode=" + zipcode + ", city=" + city + "]";
	}
	

}
