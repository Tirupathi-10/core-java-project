package com.Oops.Abstract;

public abstract class Payment {
	double amount;
	double transactionFee;

	

	abstract void pay(double amount);

	void display() {
		System.out.println("Transaction Fees: " + transactionFee);
		System.out.println("Amount: " + amount);
		System.out.println("Total Amount:" + (amount + transactionFee));
		System.out.println("Payment Successfully");

	}
}

class CreditCard extends Payment {

	

	@Override
	void pay(double amount) {
		this.amount=amount;
		transactionFee = amount * 2 / 100;
		display();

	}

}

class UPI extends Payment {

	@Override
	void pay(double amount) {
		this.amount=amount;
		transactionFee = 0;
		display();
	}

}

class NetBanking extends Payment {

	@Override
	void pay(double amount) {
		this.amount=amount;
		transactionFee = 10;
		display();
	}

}
