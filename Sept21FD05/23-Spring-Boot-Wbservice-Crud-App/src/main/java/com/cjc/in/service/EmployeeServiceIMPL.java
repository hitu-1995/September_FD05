package com.cjc.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Employeee;
import com.cjc.in.repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employeee getEmployee(int eid) {

		   Optional<Employeee> optional = repository.findById(eid);
		   if(optional.isPresent()) {
			   Employeee employeee = optional.get();
			   return employeee;
		   }
		return null;
	}

	@Override
	public void saveEmployee(Employeee employeee) {
		
		  System.out.println("saveEmployee :: called");
		  repository.save(employeee);
		System.out.println(employeee);
	}

}
