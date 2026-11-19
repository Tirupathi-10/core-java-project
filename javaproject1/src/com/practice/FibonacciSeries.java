package com.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int num = 11;

		for (int i = 1; i <= num; i++) {

			System.out.print(a + " ");

			int c = a + b;
			a = b;
			b = c;

		}
	}

}
