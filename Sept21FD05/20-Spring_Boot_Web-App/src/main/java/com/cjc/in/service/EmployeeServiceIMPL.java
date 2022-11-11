package com.cjc.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Employee;
import com.cjc.in.repository.EmployeeRepo;

@Service
public class EmployeeServiceIMPL implements EmployeeService{

	  @Autowired
	  private EmployeeRepo repo;
	
	@Override
	public void saveEmployee(Employee employee) {
	
		  repo.save(employee);
		  
	      System.out.println("** Record Saved **");
		
	}

	@Override
	public List<Employee> getAllRecords(String uname, String pass) {
		
		if(uname.equals("admin")&&pass.equals("admin")) {
			return repo.findAll();
		}
		return null;
	}

}
