package com.LogicalStatements.loops1;

import java.util.Scanner;

public class DigitSumgreaterthan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int greater = sumGreater(n);
		System.out.println("Sum: "+greater);
	}

	static int sumGreater(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem < 5) {
				sum += rem;
			}
			n = n / 10;
		}
		return sum;
	}

}
