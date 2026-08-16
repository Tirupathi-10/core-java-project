package com.LogicalStatements.loops1;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = sc.nextInt();
		boolean status = magicNum(n);
		if (status) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Given Number is Not a Magic Number");
		}
	}

	static boolean magicNum(int n) {
		boolean status = false;
		int rem = 0;
		int sum = 0;
		while (n > 9) {
			sum = 0;
			while (n > 0) {
				rem = n % 10;
				sum += rem;
				n = n / 10;
			}
			n = sum;
		}
		if (sum == 1) {
			status = true;
		}
		return status;
	}

}
