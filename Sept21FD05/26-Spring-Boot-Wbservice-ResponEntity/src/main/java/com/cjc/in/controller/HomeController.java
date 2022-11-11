package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.in.model.Employee;
import com.cjc.in.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class HomeController {

	   @Autowired
	  private EmployeeService service;
	  
	
	@GetMapping("/checkApp")
	public ResponseEntity<String> check() {
				
		String msg="REST-API- Working Fine !!";
		
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	@PostMapping("/insertData")
	public ResponseEntity<String> insertData(@RequestBody Employee employee) {
		  
		boolean flag = service.insertEmployee(employee);
		  if(flag)
			  return new ResponseEntity<String>("Employee Exist",HttpStatus.ALREADY_REPORTED);
		  else
			  return new ResponseEntity<String>("Employee Inserted",HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmployeeData/{eid}")
	public ResponseEntity<Employee> getEmployeeData(@PathVariable int eid) {
		    Employee emp = service.getEmployee(eid);
		      if(emp!=null)
		    	  return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		      else
		    	  return new ResponseEntity<Employee>(emp,HttpStatus.BAD_REQUEST);
	}
}
