package com.cjc.in.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Student;
import com.cjc.in.service.StudentService;

@RestController
@RequestMapping("/prodApi")
public class ProducerController {

	  @Autowired
	  private StudentService service;
	  

	
	@GetMapping("/getAllProduceStudent/{uname}/{pass}")
	public Map<String, Student> getAllStudents(
			@PathVariable String uname,
			@PathVariable String pass) {
		
		
		return service.getAllStudents(uname, pass);
	}
}
