package com.LogicalStatements.loops;

import java.util.Scanner;

public class Perfectnum {

	int sum = 0;

	boolean perfectNumInfo(int n) {

		boolean result = false;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
				System.out.println(i + " ");
			}
		}
		return result;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find Factors:");
		int n = sc.nextInt();
		boolean result = perfectNumInfo(n);
		if (sum == n) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}

	}
}
