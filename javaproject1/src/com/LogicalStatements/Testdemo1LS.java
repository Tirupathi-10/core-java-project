package com.LogicalStatements;

import java.util.Scanner;

public class Testdemo1LS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("you are eligibile for Driving");
		} else {
			System.out.println("you are not eligible for driving");
		}
		if (age >= 18) {
			System.out.println("Eligible for Voting");
		} else {
			System.out.println("Not Eligible for Voting");
			
		}
		System.out.println();
		System.out.println("Enter the marks:");
		int marks = sc.nextInt();
		if (marks >= 35) {
			System.out.println("Passed");
		} else {
			System.out.println("failed");
		}

		sc.close();
	}

}
