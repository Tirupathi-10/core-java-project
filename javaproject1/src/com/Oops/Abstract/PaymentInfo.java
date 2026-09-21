package com.Oops.Abstract;

public class PaymentInfo {

	public static void main(String[] args) {
		Payment p;
		p = new CreditCard();
		p.pay(5000);
		p = new UPI();
		p.pay(3000);
		p = new NetBanking();
		p.pay(5000);
	}

}
