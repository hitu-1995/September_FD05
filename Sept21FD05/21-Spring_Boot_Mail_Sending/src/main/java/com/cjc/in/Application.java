package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		MailService service = context.getBean(MailService.class);
		service.sendEmail("bhushanrpatil799@gmail.com", 
				"Hello Bhushan",
				"You Are Problem !!");
	}

}
