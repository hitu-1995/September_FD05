package com.cjc._Spring_IOC_Java_Based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Employee emp = context.getBean("employee", Employee.class);
		emp.setEname("Ravi");

		Employee emp1 = context.getBean("employee", Employee.class);
		emp1.setEname("Raj");

		EmployeeService service = context.getBean("employeeService", EmployeeService.class);
		service.insertEmployee(emp);
		service.insertEmployee(emp1);

		System.out.println("Main----END");

	}
}
