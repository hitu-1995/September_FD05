package com.cjc.in.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Student;
import com.cjc.in.service.StudentService;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private StudentService service;
	
	@PostMapping("insertData")
	public String insertData(@RequestBody Student stu) {
		      service.saveStudent(stu);
		return "Inserted";
	}
	
	@GetMapping("/getDataByMarks/{marks}")
	public List<Student> getDataByMarks(@PathVariable double marks) {
		
		return service.getStudentByLessMarks(marks);
	}
	
}
