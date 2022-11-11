package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical{

	@Override
	public void start() {
	
		System.out.println("Car :: Started ");
	}

	@Override
	public void stop() {
	
		System.out.println("Car :: Stoped");
	}

}
