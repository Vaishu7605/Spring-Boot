package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class student {
	@Id
	String name;
	String city;
	String age;
	String email;
	String phone;
	
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	public student(String name, String city, String age, String email, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}
	
	
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ", age=" + age + ", email=" + email + ", phone=" + phone
				+ "]";
	}



	
}
