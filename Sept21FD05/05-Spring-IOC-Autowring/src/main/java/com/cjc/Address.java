package com.cjc;

public class Address {

	private String area;
	private String city;
	
	public Address(String area, String city) {
	   System.out.println("Constructor Address Called");
		this.area = area;
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}
	
	
}
