package com.cjc.in.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Customer;

@RestController
@RequestMapping("/consumeApi")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/checkc")
	public String check() {
		
		return "Consumer App Up";
	}
	
	@GetMapping("/getConsumeData")
	public ResponseEntity<Map<String, Customer>> getConsumeData() {
		
		//String url = "http://localhost:8081/getProd/prodApi/getProduceData";
		String url = "http://zuul/getProd/prodApi/getProduceData";
		
		   Map map = restTemplate.getForObject(url, Map.class);
		   
		return new ResponseEntity<Map<String,Customer>>(map,HttpStatus.OK);
	}
	
}
