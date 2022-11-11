package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String landingPage() {
		System.out.println("landingPage Controller called ....");
		return "landing";
	}
	
	@RequestMapping("/log")
	public String loginPage() {
		System.out.println("LoginPage() Called...");
		return "login";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String loginCheck(@RequestParam("use") String uname, @RequestParam("password") String pass) {
	
		System.out.println("loginCheck() Method Called...");
		System.out.println(uname +" "+pass);
		return "success  "+uname +" "+pass;
	}
}
