package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Driver {
	
	@Autowired
	@Qualifier("car")
	private Vehicle vehicle;
	
	
	public void vehicleStart() {
		
	
		vehicle.start();
		
		System.out.println("********");
		
		vehicle.stop();
	}

}
