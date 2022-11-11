package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		 TicketGenerator tcg1 = context.getBean("tcg",TicketGenerator.class);
		
		 tcg1.generateTiket(context.getBean("tc",Ticket.class));
		 tcg1.generateTiket(context.getBean("tc",Ticket.class));
		 tcg1.generateTiket(context.getBean("tc",Ticket.class));
		 tcg1.generateTiket(context.getBean("tc",Ticket.class));
	}
}
