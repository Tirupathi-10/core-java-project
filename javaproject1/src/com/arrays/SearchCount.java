package com.arrays;

import java.util.Scanner;

public class SearchCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = { 10, 10, 33, 67, 10, 76, 89, 18 };

		System.out.println("Enter a Number to Search:");
		int search = sc.nextInt();
		int count = 0;

		for (int num : n) {
			if (num == search) {
				count++;
			}
		}
		System.out.println(search + " Occurs " + count + " Times");
	}

}
