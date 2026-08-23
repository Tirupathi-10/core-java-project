package com.LogicalStatements.loops;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			if (rem > max) {
				secondmax = max;
				max = rem;
			} else if (rem > secondmax && rem != max) {
				secondmax = rem;
			}
		}
		System.out.println(secondmax);
	}

}
