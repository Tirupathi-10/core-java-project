package com.LogicalStatements;

import java.util.Scanner;

public class Movietheater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Choise");
		System.out.println("1)Silver  -200");
		System.out.println("2)Gold    -300");
		System.out.println("3)Platinum-500");
		System.out.println("4)Exit");
		System.out.println("--------------------------");
		while (true) {
			System.out.println("Enter the Ticket choise:");
			int choise = sc.nextInt();
			if (choise > 3) {
				System.out.println("Invalid Choise choose Correct One");
				break;
			}
			System.out.println("Enter Your Age:");
			int age = sc.nextInt();
			switch (choise) {
			case 1:
				int price = 200;
				String tickettype = "Silver";
				System.out.println("Ticket Price:" + price);
				System.out.println("Ticket Type:" + tickettype);
				if (age >= 65) {
					price = price - (price * 10 / 100);
				}
				System.out.println("Silver Ticket Price:" + price);
				System.out.println("Thank You 😊😊😊!! Visit Again");
				break;
			case 2:
				int price1 = 300;
				String tickettype2 = "Gold";
				System.out.println("Ticket Price:" + price1);
				System.out.println("Ticket Type:" + tickettype2);
				if (age >= 65) {
					price1 = price1 - (price1 * 10 / 100);
				}
				System.out.println("Gold Ticket Price:" + price1);
				System.out.println("Thank You 😊😊😊!! Visit Again");
				break;
			case 3:
				int price2 = 500;
				String tickettype3 = "Platinum";
				System.out.println("Ticket Price:" + price2);
				System.out.println("Ticket Type:" + tickettype3);
				if (age >= 65) {
					price2 = price2 - (price2 * 10 / 100);
				}
				System.out.println("Platinum Ticket Price:" + price2);
				System.out.println("Thank You 😊😊😊!! Visit Again");
				break;

			default:
				System.out.println("invalid choise enter again");

			}
		}

	}

}
