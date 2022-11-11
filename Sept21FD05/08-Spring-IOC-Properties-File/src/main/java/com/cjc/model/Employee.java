package com.cjc.model;

//@Component
public class Employee {

	
	private int eid;
	private String ename;
	
	public Employee() {
 
		 System.out.println("Employee :: Constructor Called");
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
