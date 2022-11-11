package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employeee;
import com.cjc.in.service.EmployeeService;

@RestController
@RequestMapping("employeeApi")
public class HomeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/check")
	public String check() {

		return "My Webservices App is Running";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getEmployee/{eid}")
	public Employeee getEmployeee(@PathVariable int eid) {

		Employeee employee = service.getEmployee(eid);

		if (employee != null)
			return employee;
		else
			return new Employeee();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/insertEmployee")
	public String insertData(@RequestBody Employeee employeee) {
		System.out.println("insertData :: Called");
		service.saveEmployee(employeee);

		return "Employee Inserted";
	}

}
