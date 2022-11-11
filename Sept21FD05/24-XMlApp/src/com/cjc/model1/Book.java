package com.cjc.model1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {


	private int bid;
	private String bname;
	
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [rollno=" + bid + ", bname=" + bname + "]";
	}

	

}
