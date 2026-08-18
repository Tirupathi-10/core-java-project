package com.arrays;

import java.util.Scanner;

public class FirstandLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = { 10, 20, 30, 50, 40, 10 };
		System.out.println("Enter the Number to search");
		int search = sc.nextInt();
		int count = 0;

		for (int i = 0; i < n.length; i++) {
			if (n[i] == search) {
				count++;
			}
		}
		System.out.println("Count: " + count);
		int first = -1;
		int last = -1;

		for (int i = 0; i < n.length; i++) {
			if (search == n[i]) {
				first = i;
				break;
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] == search) {
				last = i;
			}
		}
		System.out.println("First Index: " + first);
		System.out.println("Last Index: " + last);
	}

}
