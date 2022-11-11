package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
	   System.out.println("*** Main Start ***");
		
	   ApplicationContext apc = new ClassPathXmlApplicationContext("bean.xml");
		
	  
	   Engine engine = apc.getBean("e1",Engine.class);
	   engine.startEngine();
	   
	   
	}
}
