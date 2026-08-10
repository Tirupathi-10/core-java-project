package com.LogicalStatements.loops;

import java.util.Scanner;

public class EvenandOdd {
	static void primeinfo(int n) {
		for (int i = 0; i <= n; i++) {
			if (i != 0 && i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	static void oddInfo(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		primeinfo(n);
		oddInfo(n);

	}

}
