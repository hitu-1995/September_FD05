package com.cjc.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.exceptions.EmployeeNotFoundException;
import com.cjc.in.model.Employee;
import com.cjc.in.repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public boolean insertEmployee(Employee employee) {

		Optional<Employee> id = repository.findById(employee.getEid());
		if (id.isPresent()) {
			return true;
		} else {
			repository.save(employee);
			return false;
		}
	}

	@Override
	public Employee getEmployee(int eid) {  
		   int num=eid;
		    int count=0;		  
		    while(num>0) {
		    	num=num/10;
		    	count++;
		    }
          if(count!=3) { // 123
              throw new  NullPointerException(); 
          }
          Optional<Employee> optional = repository.findById(eid);
          if(optional.isPresent()) {
        	  return optional.get();
          }
          else {
        	  throw new EmployeeNotFoundException();
          }
	} 
	 
}
