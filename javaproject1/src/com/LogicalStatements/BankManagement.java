package com.LogicalStatements;

import java.util.Scanner;

public class BankManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance = 10000.0;
		while (true) {
			System.out.println("------Bank Menu------");
			System.out.println("1. Account Balance");
			System.out.println("2. Deposite");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");

			System.out.println("Enter Your Choise");
			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				System.out.println("Available Balance:" + balance);
				break;
			case 2:
				System.out.println("Enter the Deposite Amount:");
				double deposite = sc.nextDouble();

				if (deposite > 0) {
					balance += deposite;
					System.out.println("Deposite Successfully");
					System.out.println("Current Balance:" + balance);
				} else {
					System.out.println("Invalid Amount");
				}
				break;
			case 3:
				System.out.println("Enter the Withdraw Amount:");
				double withdraw = sc.nextDouble();
				if (withdraw > 0 && withdraw <= balance) {
					balance -= withdraw;
					System.out.println("Withdraw Successfully");
					System.out.println("Remaining Balance:" + balance);
				} else {
					System.out.println("Insufficient Balance or Invalid Amount");
				}
				break;
			case 4:
				System.out.println("Thank You for Banking With Us!");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choise");
			}
		}
	}

}


