package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Student;
import com.cjc.in.service.StudentService;

@RestController
@RequestMapping("/produceApi")
public class StudentProducerController {

	  @Autowired
	 private StudentService service;
	
	@PostMapping("/insertProducerData")
	public String insertData(@RequestBody Student student) {
	
		System.out.println("-------Producer-------");
		System.out.println(student);
        service.saveStudent(student);
		System.out.println("-------Producer--------");
		
		return "Student Inserted In Producer";
	}
     @DeleteMapping("/deleteProduceData/{rollno}")	
 	public String deleteData(@PathVariable int rollno) {
		
    	 service.deleteStudent(rollno);
    	 
    	 return "Student Deleted With Roll No "+rollno;
	}
	
     @PutMapping("/updatePStudent")
     public String updateData(@RequestBody Student student) {
    
    	 service.updateData(student);
    	 
    	 return "Updated ..";
     }
     
}












