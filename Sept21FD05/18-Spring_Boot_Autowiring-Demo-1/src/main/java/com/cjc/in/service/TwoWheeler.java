package com.cjc.in.service;

import org.springframework.stereotype.Component;

@Component
public class TwoWheeler implements Vehicle {

	@Override
	public void start() {

		System.out.println("TwoWheeler start");

	}

	@Override
	public void stop() {
		
		System.out.println("TwoWheelear stop");
	}

}
