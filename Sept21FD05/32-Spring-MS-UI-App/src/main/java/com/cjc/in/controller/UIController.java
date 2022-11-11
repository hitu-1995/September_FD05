package com.cjc.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

	@RequestMapping("/")
	public String landingPage() {
		
		return "index";
	}
	
	@RequestMapping("/log")
	public String loginPage() {
		
		return "login";
	}
}
