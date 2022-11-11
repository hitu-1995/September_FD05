package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cjc.in.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Student student = context.getBean(Student.class);
		
		System.out.println(student);
	}
	
	
		public Student getStudent() {
			
			Student stu = new Student();
			stu.setRollno(101);
			stu.setName("Shubham");
			stu.setAddress("Pimpri");
			
			return stu;


	}
	
	}
