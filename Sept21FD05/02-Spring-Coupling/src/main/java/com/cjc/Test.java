package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	   System.out.println("*** Main Start ***");
		
	   ApplicationContext apc = new ClassPathXmlApplicationContext("bean.xml");
		
	   Car car = apc.getBean("car",Car.class);
	   
	   car.startCar();
	   
	   TwoWheelar twoWheelar = apc.getBean("tw",TwoWheelar.class);
	   
	   twoWheelar.startTwoWheelar();
	   
	   
	   
	   
	}
}
