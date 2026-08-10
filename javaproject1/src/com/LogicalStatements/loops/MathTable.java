package com.LogicalStatements.loops;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Procede with Table");
		int num = sc.nextInt();
		System.out.println("Enter a Number how many times to print");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}

}
