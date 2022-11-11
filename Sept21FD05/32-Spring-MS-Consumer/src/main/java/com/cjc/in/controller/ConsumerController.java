package com.cjc.in.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Student;

@RestController
@RequestMapping("/consumeApi")
@CrossOrigin("*")
public class ConsumerController {

	  @Autowired 
	  private RestTemplate template;
	
	@GetMapping("/getAllConsumeStudent/{uname}/{pass}")
	public ResponseEntity<Map<String, Student>> getAllStudents(
			@PathVariable String uname,
			@PathVariable String pass) {
		
		String url = "http://localhost:8081/prodApi/getAllProduceStudent/"+uname+"/"+pass+"";
		
		  Map<String,Student> map=template.getForObject(url, Map.class);
		  
		return new ResponseEntity<Map<String,Student>>(map,HttpStatus.ACCEPTED);
	}
}
