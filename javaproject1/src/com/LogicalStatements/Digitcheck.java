package com.LogicalStatements;

import java.util.Scanner;

public class Digitcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();

		if (num >= 1 && num <= 9) {
			System.out.println("If the Number has 1 digits");
		} else if (num >= 10 && num <= 99) {
			System.out.println("If the Number has 2 digits");
		} else if (num >= 100 && num <= 999) {
			System.out.println("If the Number has 3 digits");
		} else if (num > 999) {
			System.out.println("If the Number has more then 3 digits");
		} else {
			System.out.println("Invalid Number");
		}
		sc.close();

	}

}
