package com.cjc.in.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundException(String msg){
		
		super(msg);
	}
}
