package com.cjc.model;
import java.util.List;
import java.util.Map;

public class Student {

	private int rollno;
	private String name;
	private List<List<String>> books;
	private Map<Integer, String> map;
	
	
	
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public List<List<String>> getBooks() {
		return books;
	}
	public void setBooks(List<List<String>> books) {
		this.books = books;
	}
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
	
	public Student() {

	  System.out.println("*** Student() Constructor Called ***");
	}
	
}
