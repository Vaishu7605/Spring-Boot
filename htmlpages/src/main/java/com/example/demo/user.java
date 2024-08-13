package com.example.demo;

public class user {
	String name;
	String city;
	String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public user(String name, String city, String email) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", city=" + city + ", email=" + email + "]";
	}
	
	
	
}