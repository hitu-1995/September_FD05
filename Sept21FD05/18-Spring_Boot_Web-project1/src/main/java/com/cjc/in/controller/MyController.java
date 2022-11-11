package com.cjc.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String indexPage() {
		
		System.out.println("index Page called");
		
		return "index";
	}
	
	public String loginPage() {
		
		System.out.println("Login page called");
	}
}
