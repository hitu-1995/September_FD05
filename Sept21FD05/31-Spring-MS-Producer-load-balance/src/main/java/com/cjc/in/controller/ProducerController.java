package com.cjc.in.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Customer;

@RestController
@RequestMapping("/prodApi")
public class ProducerController {

	
	@GetMapping("/checkp")
	public String  checkApi() {
		
	  return "Producer Service Up";
	}
	
	@GetMapping("/getProduceData")
	public Map<String, Customer> getCustomer() {
		
		Map<String, Customer> map = new HashMap<String, Customer>();
		
		map.put("cust1", new Customer(101, "Dhiraj", "Jalgaon"));
		map.put("cust2", new Customer(102, "Bhushan", "Jalgaon"));
		map.put("cust3", new Customer(103, "Dhananjay", "Raver"));
		
		return map;
	}
	
	
}
