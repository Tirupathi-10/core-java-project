package com.LogicalStatements.loops;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance = 10000;
		double totaldeposited = 0;
		double totalwithdrawn = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Transction:" + i);
			System.out.println("Enter the Amount:");
			double amount = sc.nextDouble();
			System.out.print("Enter 1 for Deposit or 2 for Withdraw: ");
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();

			if (choice == 1) {

				balance = balance + amount;
				totaldeposited = totaldeposited + amount;
				System.out.println("Deposited Successfully");
			} else if (choice == 2) {
				if (amount <= balance) {

					balance = balance - amount;
					totalwithdrawn = totalwithdrawn + amount;

					System.out.println("Withdrawn Successfully");
				} else {
					System.out.println("Insufficient Balance");
				}

			} else {
				System.out.println("Invalid Choice");
			}
		}
		System.out.println("Final Balance = " + balance);
		System.out.println("Total Deposited = " + totaldeposited);
		System.out.println("Total Withdrawn = " + totalwithdrawn);

		sc.close();
	}

}
