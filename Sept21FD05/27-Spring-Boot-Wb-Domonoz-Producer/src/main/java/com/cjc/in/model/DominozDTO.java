package com.cjc.in.model;

public class DominozDTO {

	private int orderid;
	private String location;
	private String food_name;
	private double price;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "DominozDTO [orderid=" + orderid + ", location=" + location + ", food_name=" + food_name + ", price="
				+ price + "]";
	}
	public DominozDTO(int orderid, String location, String food_name, double price) {
		super();
		this.orderid = orderid;
		this.location = location;
		this.food_name = food_name;
		this.price = price;
	}
	
	public DominozDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
}
