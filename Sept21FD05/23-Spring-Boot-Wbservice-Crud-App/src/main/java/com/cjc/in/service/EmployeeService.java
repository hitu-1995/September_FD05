package com.cjc.in.service;

import com.cjc.in.model.Employeee;

public interface EmployeeService {

	public Employeee getEmployee(int eid);

	public void saveEmployee(Employeee employeee);
}
