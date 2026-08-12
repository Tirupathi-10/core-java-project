package com.chartgpt;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int even = sumofDigit(n);
		System.out.println("Sum of Even Nubmers: " + even);
	}

	static int sumofDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;

			sum += rem;
			n = n / 10;
		}
		return sum;
	}

}
