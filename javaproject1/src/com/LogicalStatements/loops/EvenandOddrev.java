package com.LogicalStatements.loops;

import java.util.Scanner;

public class EvenandOddrev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int even = evenRev(n);
		System.out.println("Even digits Reverse order is: " + even);
		int odd = oddRev(n);
		System.out.println("Odd Digits Reverse order is: " + odd);
	}

	static int evenRev(int n) {
		int rev = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				rev = rev * 10 + rem;
			}
			n = n / 10;
		}
		return rev;
	}

	static int oddRev(int n) {
		int rev = 0;
		int rem = 0;
		while (n != 0) {
			rem = n % 10;
			if (rem % 2 != 0) {
				rev = rev * 10 + rem;
			}
			n = n / 10;
		}
		return rev;
	}

}
