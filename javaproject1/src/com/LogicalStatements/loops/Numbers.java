package com.LogicalStatements.loops;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i += 1) {
			System.out.println(n + "×" + i + "=" + n * i);
		}
		System.out.println("Enter the Ending Character:");
		char end = sc.next().charAt(0);
		System.out.println("Enter the Starting character:");
		char start = sc.next().charAt(0);
		for (char ch = end; ch >= start; ch--) {
			System.out.print(ch + " ");
		}
		sc.close();

	}
}
