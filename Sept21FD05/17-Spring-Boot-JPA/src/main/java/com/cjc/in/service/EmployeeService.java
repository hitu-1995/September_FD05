package com.cjc.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.dao.EmployeeDao;
import com.cjc.in.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public void insertEmployee() {
		Employee employee = new Employee();
		employee.setEid(101);
		employee.setEname("Hitesh");
		employee.setEaddress("Akurdi");
		dao.save(employee);

		System.out.println("** Employee Inserted ***");
	}

	public void getEmployee(int eid) {

		Optional<Employee> optional = dao.findById(eid);
		if (optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
		}

	}
}
