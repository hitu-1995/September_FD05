package com.cjc;

public class TwoWheelar {

	private Engine e;

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	
	
	public void startTwoWheelar() {
		
		if(e!=null) {
			e.start();
		}
		else {
			System.out.println("Two Wheelar Failed To Start !!!");
		}
	}
}
