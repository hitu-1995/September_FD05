package com.cjc;

public class Car {

	
	private Engine e;  // null

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	
	public void startCar() {
		
		if(e!=null)
			e.start();
		else
			System.out.println("Car Failed To Start");
	}
	
	
	
}
