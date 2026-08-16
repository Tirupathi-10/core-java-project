package com.LogicalStatements.loops;

import java.util.Scanner;

public class Dec2Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		isBinary(n);
	}

	static void isBinary(int n) {
		int rem = 0;
		String s = "";
		while (n > 0) {
			rem = n % 2;
			s = s + rem;
			n = n / 2;
		}
		System.out.println(s);
	}

}
