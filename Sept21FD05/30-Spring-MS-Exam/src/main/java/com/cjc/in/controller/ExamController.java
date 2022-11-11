package com.cjc.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examApi")
public class ExamController {

	@GetMapping("getExam")
	public String getExam() {
		
		return "Welcome To Exam Service";
	}
	
}
