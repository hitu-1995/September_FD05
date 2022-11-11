package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class TwoWheelar implements Vehical{

	@Override
	public void start() {
		System.out.println("TwoVheelar :: Started");
	}

	@Override
	public void stop() {
		System.out.println("TwoVheelar :: Stoped");
		
	}

}
