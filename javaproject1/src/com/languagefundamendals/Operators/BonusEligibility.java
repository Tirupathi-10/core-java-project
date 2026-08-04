package com.languagefundamendals.Operators;

import java.util.Scanner;

public class BonusEligibility {

	public static void main(String[] args) {
		System.out.println("-----Bonus Eligibility-----");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Performance Rating(0-5):");
		double rating = sc.nextDouble();
		String result = (rating >= 4 && rating <= 5) ? "Eligible For Bonus" : "Not Eligible for Bonus";
		System.out.println("Status:" + result);
	}

}
