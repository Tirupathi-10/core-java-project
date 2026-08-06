package com.LogicalStatements.loops;

import java.util.Scanner;

public class PositiveorNeg {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to find Pos or Neg");
		int n = sc.nextInt();
		numberCheck(n);

	}

	void numberCheck(int n) {
		if (n > 0) {
			System.out.println("Positive");
		} else if (n < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}
}
