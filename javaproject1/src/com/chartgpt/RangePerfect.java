package com.chartgpt;

import java.util.Scanner;

public class RangePerfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Upto Where we want to print perfect Numbers");
		int n = sc.nextInt();

		isPerfect(n);
	}

	static void isPerfect(int n) {
		for (int num = 1; num <= n; num++) {
			int sum = 0;
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			if (sum == num) {
				System.out.println(num);
			}
		}

	}
}
