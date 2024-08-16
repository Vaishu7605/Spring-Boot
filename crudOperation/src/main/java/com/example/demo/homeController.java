package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
	@Autowired
	private studentRepository std;
	
	@GetMapping("/")
	public String home(Model m1) {
		m1.addAttribute("s1", new student());
		return "index";
	} 
	
	@PostMapping("/register")
	public String home(@ModelAttribute student s, Model m) {
		System.out.println(s);
		System.out.println("Welcome" + " "+ s.getName());
		m.addAttribute("key", s.getName());
		std.save(s);
		return "register";
	}
}
