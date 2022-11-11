package com.cjc._Spring_IOC_Java_Based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Employee {

	private int eid;
	private String ename;


	@Autowired()
	private Address address;
	
	public Employee() {
 
		 System.out.println("No--Param--Const");
	}
	

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
	System.out.println("Setter called");
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
