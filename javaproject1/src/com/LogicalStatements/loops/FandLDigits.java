package com.LogicalStatements.loops;

import java.util.Scanner;

public class FandLDigits {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int first = firstDigit(n);
		System.out.println("First Digit Of a Given Number is: " + first);
		int last = lastDigit(n);
		System.out.println("Last Digit of a Given Number is: " + last);
		int sum = last + first;
		System.out.println(sum);
	}

	int firstDigit(int n) {
		int first = 0;
		while (n >= 10) {
			n = n / 10;
		}
		return n; 
	}

	int lastDigit(int n) {
		int last = 0;
		n = n % 10;
		return n;
	}

}
