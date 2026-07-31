package com.LogicalStatements;

import java.util.Scanner;

public class DiscountLS {
	double discinfo(double amount) {
		double discount = 0;
		if (amount > 10000) {
			discount = amount * 20 / 100;
		} else if (amount >= 7500) {
			discount = amount * 15 / 100;
		} else if (amount >= 5000) {
			discount = amount * 10 / 100;
		} else if (amount >= 2000) {
			discount = amount * 5 / 100;
		} else {
			discount = 0;
		}
		System.out.println("Discount amount    :" + discount);
		return amount - discount;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		double amount = sc.nextDouble();
		double totalamount = discinfo(amount);
		System.out.println("Total amount       :" + totalamount);
		sc.close();
	}

}
