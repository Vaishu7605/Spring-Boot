package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping("/")
	public String home() {
			return "rest api called ...";
		}
	@GetMapping("/about")
	public String about() {
		return "about api called";
	}
		
	}


