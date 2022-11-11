package com.cjc._Spring_IOC_Java_Based;

import java.lang.reflect.Field;
import java.rmi.StubNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");

//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		Employee employee = context.getBean("getEmployee", Employee.class);
//		System.out.println(employee);
//		System.out.println(employee.getAddress().getArea());

	   Employee e=new Employee();
	   e.setEid(101);
			   
		
		Class cl = Class.forName("com.cjc._Spring_IOC_Java_Based.Employee");
		
		 Field field = cl.getDeclaredField("eid");
		 
		 field.setAccessible(true);
		
		 Integer id=(Integer) field.get(e);
		 
		 System.out.println(" "+id);
		 
		
		   
		
		
	}
}
