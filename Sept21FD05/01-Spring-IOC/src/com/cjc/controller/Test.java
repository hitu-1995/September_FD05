package com.cjc.controller;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cjc.model.Student;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Resource rs=new ClassPathResource("bean.xml");
		 *  
		 * BeanFactory factory=new XmlBeanFactory(rs);
		 * 
		 * Student student = factory.getBean("stu",Student.class);
		 * 
		 * //System.out.println(student.hashCode());
		 */		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Student student = context.getBean("stu",Student.class);
		
		System.out.println(student.getRollno()+" "+student.getName()+" "+student.getBooks());
	
		   Map<Integer, String> map = student.getMap();
		   
		   Set<Integer> set = map.keySet();
		   for(Integer key : set) {
			   
			   System.out.println("Key : "+key+" Value : "+map.get(key));
		   }
		
	}
}
