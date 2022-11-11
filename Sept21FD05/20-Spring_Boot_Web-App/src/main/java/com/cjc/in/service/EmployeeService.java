package com.cjc.in.service;

import java.util.List;

import com.cjc.in.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<Employee> getAllRecords(String uname, String pass);

}
