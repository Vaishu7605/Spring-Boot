package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class homeController {
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		return "rest controller. session id : "+ req.getSession().getId();
	}
}
