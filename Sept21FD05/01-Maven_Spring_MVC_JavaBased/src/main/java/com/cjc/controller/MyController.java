package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@Controller
public class MyController {
	@Autowired
	private StudentService service;
	
	
	@RequestMapping("/")
	public String IndexPage()
	{
		
		System.out.println("Index Page called");
		
		return "index";
	}
	
	@RequestMapping("/log")
	public String LoginPage() {
		
		System.out.println("Login page called");
		
		return "login";
	}
	@RequestMapping("/reg")
	public String registerPage() {
		
		System.out.println("Register page called");
		
		return "register";

	}
	@RequestMapping("save")
	
	public String saveStudent(@ModelAttribute Student student) {
		
		System.out.println(student);
		
		service.saveStudent(student);
		
		
		return "index";
		
		
		
	}
	@RequestMapping("login")
	public String loginCheck(@RequestParam String uname
			,@RequestParam String pass, ModelMap map) {
		
		List<Student> stuList = service.selectAllStudent(uname,pass);
		System.out.println(stuList);
		if(!stuList.isEmpty()) {
			map.addAttribute("data",stuList);
			return "success";
		}
		else {
			
			return "login";
		}
	}
}
