package com.cjc.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private JavaMailSender sender;
	
	public void sendEmail(
			String to,
			String sub,
			String text
			) {
		
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("hiteshwankhede11@gmail.com");
		message.setTo(to);
		message.setSubject(sub);
		message.setText(text);
		
		sender.send(message);
		
		System.out.println("Mail Sent Successfull !!!");
	}
}
