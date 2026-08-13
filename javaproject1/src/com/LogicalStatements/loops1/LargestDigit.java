package com.LogicalStatements.loops1;

import java.util.Scanner;

public class LargestDigit {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		int digit = isLargeDigit(n);
		System.out.println("Largest Digit: " + digit);
	}

	int isLargeDigit(int n) {
		int digit = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem > digit) {
				digit = rem;
			}
			n = n / 10;
		}
		return digit;
	}

}
