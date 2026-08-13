package com.LogicalStatements.loops;

import java.util.Scanner;

public class EandOsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int sum = evenSum(n);
		System.out.println("Sum of the Even Numbers is: " + sum);
		int sum1 = oddSum(n);
		System.out.println("Sum of the Odd Numbers is: " + sum1);
		int diff=sum-sum1;
		System.out.println(diff);
	}

	static int evenSum(int n) {
		int sum = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				sum += rem;
			}
			n = n / 10;

		}
		return sum;
	}

	static int oddSum(int n) {
		int sum = 0;
		int rem = 0;
		while (n != 0) {
			rem = n % 10;
			if (rem % 2 != 0) {
				sum += rem;
			}
			n = n / 10;
		}
		return sum;
	}

}
