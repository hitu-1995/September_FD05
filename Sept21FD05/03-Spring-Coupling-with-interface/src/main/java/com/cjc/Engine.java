package com.cjc;

public class Engine {

	private Vehical vehical;  // new Car();
	
	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}
	public void startEngine() {
		 if(vehical!=null) {
			 vehical.startVehical();
		 }
		 else
			 System.out.println("Vheical Dependancy Not Injected");
	 }

}
