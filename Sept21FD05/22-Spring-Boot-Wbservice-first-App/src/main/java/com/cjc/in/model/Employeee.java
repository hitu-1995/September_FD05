package com.cjc.in.model;

public class Employeee {

	private int eid;
	private String ename;
	private String eaddress;
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
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Employeee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
	
	
}
