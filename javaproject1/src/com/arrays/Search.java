package com.arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = { 10, 45, 33, 67, 89, 76, 89, 18 };

		System.out.println("Enter a Number to Search:");
		int search = sc.nextInt();
		boolean status = false;

		for (int num : n) {
			if (num == search) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println("Element Found: " + search);
		} else {
			System.out.println("Element Not Found: " + search);
		}
	}
}
