package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {

	@Id
	private int cid;
	private String cname;
	private String address;
	private String product;
	private long mobileno;
	public Customer(int cid, String cname, String address, String product, long mobileno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.product = product;
		this.mobileno = mobileno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Customer ID:  " + cid + " Cust name : " + cname +
				" Address : " + address + " Product : " + product
				+ " Mobile No : " + mobileno;
	}

	 public Customer() {
		
	}
	
	
}
