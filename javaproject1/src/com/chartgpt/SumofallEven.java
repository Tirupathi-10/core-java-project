package com.chartgpt;

import java.util.Scanner;

public class SumofallEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int even = sumofEven(n);
		System.out.println("Sum of Even Nubmers: " + even);
	}

	static int sumofEven(int n) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int rem = i % 10;
			if (i % 2 == 0) {
				sum += i;
			}
			n = n / 10;
		}
		return sum;
	}

}
