package com.cjc.model;

public class Student {

	private int rollno;
	private String name;
	private String address;
	private long mobileno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student Info\nRollno : " + rollno + 
				"\nName : " + name + 
				"\nAddress : " + address + "\nMobile No : " + mobileno;
	}
}
