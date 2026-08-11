package com.LogicalStatements.loops;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check Prime Or Not");
		int n = sc.nextInt();
		boolean result = isPrime(n);
		if (result) {
			System.out.println("Given Number is Prime Number");
		} else {
			System.out.println("Given Number is Not Prime Number");
		}
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
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
				status = false;
				break;
			}
		}
		return status;
	}

}