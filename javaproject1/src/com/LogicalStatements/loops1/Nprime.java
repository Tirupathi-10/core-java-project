package com.LogicalStatements.loops1;

import java.util.Scanner;

public class Nprime {

	public static void main(String[] args) {
		Scanner pc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = pc.nextInt();
		nPrime(n);

	}

	static void nPrime(int n) {
		int num = 2;
		int Digitcount = 0;
		while (Digitcount < n) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num + " ");
				Digitcount++;
			}
			num++;
		}
	}

}
