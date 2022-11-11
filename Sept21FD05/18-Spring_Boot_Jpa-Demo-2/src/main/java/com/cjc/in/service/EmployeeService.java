package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.in.dao.EmployeeDao;
import com.cjc.in.model.Employee;

public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public void insertEmployee() {
		
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Shubham");
		emp.setAddress("Pune ");
		
		dao.save(emp);
		
		System.out.println("data iserted");
		
		
		
	}
	
	

}
