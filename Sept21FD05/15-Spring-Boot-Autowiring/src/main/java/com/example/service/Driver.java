package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {

	@Autowired
	@Qualifier("car")
	private Vehical vehical;
	
	public void vehicalStatus() {
		
		  vehical.start();
		  System.out.println("--------------");
		  vehical.stop();
		
	}
	
	
}
