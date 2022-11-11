package com.cjc.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.in.model.Employee;
import com.cjc.in.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public String indexPage() {
		System.out.println("indexPage :: called");
		return "index";
	}

	@RequestMapping("/loginPage")
	public String loginPage() {
		System.out.println("loginPage :: Called");
		return "login";
	}

	@RequestMapping("/registerPage")
	public String registerPage() {
		return "register";
	}

	@RequestMapping("/log")
	//@ResponseBody
	public String loginCheck(@RequestParam String uname, 
			@RequestParam String pass,
			Model m) {
		System.out.println(uname + "   ----  " + pass);
		
	List<Employee>	empList=service.getAllRecords(uname,pass);
	if(empList!=null) {
	m.addAttribute("data",empList);
	return "success";
	}
	return "login";
	}

	@RequestMapping("/reg")
	public String registrationData(@ModelAttribute Employee employee) {
		System.out.println(employee);
		service.saveEmployee(employee);
		return "login";
	}

}
