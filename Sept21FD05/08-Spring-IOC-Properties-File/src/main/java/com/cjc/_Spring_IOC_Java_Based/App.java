package com.cjc._Spring_IOC_Java_Based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Employee;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		//ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		ApplicationContext xmlContext=new ClassPathXmlApplicationContext("bean.xml");
		
		Employee employee = xmlContext.getBean("emp",Employee.class);
		Employee employee1 = xmlContext.getBean("emp1",Employee.class);
		System.out.println(employee.getEid()+"  "+employee.getEname());
		System.out.println(employee1.getEid()+"  "+employee1.getEname());

	}
}
