package com.cjc.service;

import org.springframework.stereotype.Component;

import com.cjc.model.Employee;

@Component
public class EmployeeService {

	
	public EmployeeService() {
		
		System.out.println("EmployeeService :: Constructor Called");
	}
	
	public void insertEmployee(Employee employee ) {
		System.out.println("----------------------------------------");
		System.out.println(employee.getEname()+" Inserted in DB");
	}
}
