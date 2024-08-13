package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class homeController {

		@GetMapping("/")
		public String home() {
			return "index";
		}
		@GetMapping("/register")
		public String register(@ModelAttribute user u ) {
			System.out.println(u);
			return "register";
		}
}
