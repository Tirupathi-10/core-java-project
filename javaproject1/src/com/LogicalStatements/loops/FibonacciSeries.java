package com.LogicalStatements.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Times you want to print as series");
		int n = sc.nextInt();

		fibonacciSeries(n);
	}

	static void fibonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" "+n2+" ");
		int n3 = 0;
		for (int i = 1; i <= n-2; i++) {
			n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
		
	}

}
