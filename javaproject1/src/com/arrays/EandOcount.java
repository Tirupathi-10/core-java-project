package com.arrays;

import java.util.Scanner;

public class EandOcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int[] n = new int[size];
		int even = 0;
		int odd = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Enter the Numbers: ");
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Count of Even: " + even);
		System.out.println("Count of Odd: " + odd);
	}
}
