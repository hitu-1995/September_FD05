package com.cjc;

public class Student {
	
	private int rollno;
	private String name;
	
	private Address address;

	public Student(int rollno, String name, Address address) {
		System.out.println("Constuctor Called");
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address;
	}

}
