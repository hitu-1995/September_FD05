package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.model.Student;
import com.cjc.service.StudentService;
import com.cjc.service.StudentServiceIMPL;
import com.sun.corba.se.impl.javax.rmi.CORBA.StubDelegateImpl;

@Controller
public class HomeController {

	public HomeController() {
  
	   System.out.println("HomeController :: Constructor");
	}
	
	 @Autowired
	 private StudentService service;
	
	
	@RequestMapping("reg")
	public String registerPage() {
		
		System.out.println("registerPage() Method Called..");
		
		return "register";
	}
	
	@RequestMapping("save")
	public String saveStudent(@ModelAttribute Student stu) {
		
		System.out.println(stu);
		  service.saveStudent(stu);
		
		return "login";
	}
	
	@RequestMapping("login")
	public String  loginPage() {
		
		return "login";
	}
	
	@RequestMapping("log")
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
	
	@RequestMapping("/edit")
	public String editStudentData(@RequestParam int rollno, Model m) {
		
		System.out.println(rollno);
		
		Student stu= service.editStudent(rollno);
		m.addAttribute("data", stu);
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateStudentData(@ModelAttribute Student student,Model m ) {
		
		System.out.println(student);
	List<Student> stuList=service.updateStudent(student);
		m.addAttribute("data",stuList);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteStudentData(@RequestParam int rollno,Model m) {
		
	List<Student> stuList=service.deleteStudent(rollno);
	
	   m.addAttribute("data",stuList);
	   
	   return "success";
	}
	
	
}
