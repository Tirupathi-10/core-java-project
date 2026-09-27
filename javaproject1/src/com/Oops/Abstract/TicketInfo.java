package com.Oops.Abstract;

public class TicketInfo {

	public static void main(String[] args) {
		Ticket t1 = new RegularTicket(101, "Avengers", "A10", 200);

		Ticket t2 = new PremiumTicket(102, "Avengers", "B10", 200);

		Ticket t3 = new VIPTicket(103, "Avengers", "C10", 200);

		System.out.println("Regular Ticket Price: " + t1.calculatePrice());
		System.out.println("Premium Ticket Price: " + t2.calculatePrice());
		System.out.println("VIP Ticket Price: " + t3.calculatePrice());
	}

}
