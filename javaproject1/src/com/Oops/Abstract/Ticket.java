package com.Oops.Abstract;

public abstract class Ticket {
	int ticketId;
	String movieName;
	String seatNumber;
	double basePrice;
	String ticketType;

	Ticket(int ticketId, String movieName, String seatNumber, double basePrice, String ticketType) {

		this.ticketId = ticketId;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.basePrice = basePrice;
		this.ticketType = ticketType;
	}

	abstract double calculatePrice();
}


class RegularTicket extends Ticket {

	RegularTicket(int ticketId, String movieName, String seatNumber, double basePrice) {

		super(ticketId, movieName, seatNumber, basePrice, "Regular");
	}

	@Override
	double calculatePrice() {
		return basePrice;
	}
}


class PremiumTicket extends Ticket {

	PremiumTicket(int ticketId, String movieName, String seatNumber, double basePrice) {

		super(ticketId, movieName, seatNumber, basePrice, "Premium");
	}

	@Override
	double calculatePrice() {
		return basePrice + (basePrice * 0.20);
	}
}

class VIPTicket extends Ticket {

	VIPTicket(int ticketId, String movieName, String seatNumber, double basePrice) {

		super(ticketId, movieName, seatNumber, basePrice, "VIP");
	}

	@Override
	double calculatePrice() {
		return basePrice + (basePrice * 0.50);
	}
}
