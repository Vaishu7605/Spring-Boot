package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class student {
	@Id
	
	@Column
	private String name;
	@Column
	private String city;
	@Column(name="E-MAIL")
	private String mail;

}
