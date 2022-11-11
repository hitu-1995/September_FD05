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
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Student;

@RestController
@RequestMapping("/consumeApi")
public class StudentConsumerController {

	@Autowired
	private RestTemplate template;
	
	@PostMapping("/insertConsumeData")
	public ResponseEntity<String> insertData(@RequestBody Student student) {
		
		System.out.println("-------Consumer-------");
		System.out.println(student);
		System.out.println("----------Consumer-----");
		
		String url="http://localhost:8081/produceApi/insertProducerData";
		
	  String str= template.postForObject(url,student,String.class);
	    
	    return new ResponseEntity<String>(str,HttpStatus.OK);
	}
    @DeleteMapping("/deleteConsumeData/{rollno}")	
	public ResponseEntity<String> deleteData(@PathVariable int rollno) {
		  String url="http://localhost:8081/produceApi/deleteProduceData/"+rollno+""; 
		  template.delete(url, rollno);
		  System.out.println("Student Deleted Through Consumer ");
   	 return new ResponseEntity<String>("Student Deleted Through Consumer",HttpStatus.OK);
	}
    
    @PutMapping("/updateCStudent")
    public String updateData(@RequestBody Student student) {
    	String url = "http://localhost:8081/produceApi/updatePStudent";
    	template.put(url,student);
    	return "Update....";
    }
    
    
}











