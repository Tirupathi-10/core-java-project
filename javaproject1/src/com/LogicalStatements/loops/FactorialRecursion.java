package com.LogicalStatements.loops;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Find Factorial");
		int n = sc.nextInt();
		long num = fact(n);
		System.out.println("Factorial Of the Number is:" + num);
	}

	static long fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

}
