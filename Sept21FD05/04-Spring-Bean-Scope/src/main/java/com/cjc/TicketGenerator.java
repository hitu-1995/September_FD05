package com.cjc;

public class TicketGenerator {

	public TicketGenerator() {
		System.out.println("*** TicketGenerator Constructor ***");
	}

	public void generateTiket(Ticket ticket) {
    
		System.out.println("TickietGenerator ID: "+this.hashCode()+
				" Tickiet Generated ID : "+ticket.hashCode());
		System.out.println("------------------------------------");
	}
}
