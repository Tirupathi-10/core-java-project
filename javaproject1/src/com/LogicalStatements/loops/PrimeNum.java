package com.LogicalStatements.loops;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Upto Where you want to print");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status=false;
				break;
			}
		}
		return status;
	}

}
