package com.LogicalStatements.loops;

import java.util.Scanner;

public class ReverseNum {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int number = reverseNumber(n);
		System.out.println("Reverse of a Given Number is: " + number);
		palindrome(number, n);
	}

	int reverseNumber(int n) {
		int rev = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			rev = rev * 10 + rem;
		}
		return rev;
	}

	void palindrome(int number, int n) {
		if (number == n) {
			System.out.println("Given Number is A palindrome Number");
		} else {
			System.out.println("Given Number is Not a palindrome Number");
		}

	}

}
