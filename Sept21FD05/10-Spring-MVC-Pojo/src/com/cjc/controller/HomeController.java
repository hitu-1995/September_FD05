package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.model.Student;

@Controller
public class HomeController {

	public HomeController() {
  
	   System.out.println("HomeController :: Constructor");
	}
	
	@RequestMapping("reg")
	public String registerPage() {
		
		System.out.println("registerPage() Method Called..");
		
		return "register";
	}
	
	@RequestMapping("save")
	@ResponseBody
	public String saveStudent(@ModelAttribute Student stu) {
		
		System.out.println(stu);
		
		return stu.toString();
	}
}
