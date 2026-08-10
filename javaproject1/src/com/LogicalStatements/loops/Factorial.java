package com.LogicalStatements.loops;

import java.util.Scanner;

public class Factorial {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Find Factorial");
		int n = sc.nextInt();
		long num = findFact(n);
		System.out.println("Factorial Of the Number is:" + num);
	}

	long findFact(int n) {
		long fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
