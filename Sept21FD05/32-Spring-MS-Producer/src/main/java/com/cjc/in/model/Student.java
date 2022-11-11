package com.cjc.in.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class Student {
	private int rollno;
	private String name;
	private String address;
	private String division;
	public Student(int rollno, String name, String address, String division) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.division = division;
	}
	
	
	
}
