package com.cjc.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employeee;

@RestController
public class HomeController {

	@RequestMapping("/check")
	public String check() {
		
		return "My Webservices App is Running";
	}
	
	@RequestMapping("/getEmployee")
	public Employeee getEmployeee() {
		
		Employeee e=new Employeee();
		e.setEid(101);
		e.setEname("PQR");
		e.setEaddress("Pune");
		 return e;
	}
	
	
}
