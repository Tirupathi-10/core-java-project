package com.StringHandling;

import java.util.Scanner;

public class MaxOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = sc.next().toLowerCase();

		char[] arr = new char[127];

		for (int i = 0; i < str1.length(); i++) {
			arr[str1.charAt(i)]++;
		}
		int max = Integer.MIN_VALUE;
		char maxChar = ' ';

		for (int i = 0; i < str1.length(); i++) {
			if (arr[str1.charAt(i)] > max) {
				max = arr[str1.charAt(i)];
				maxChar = str1.charAt(i);
			}
		}
		System.out.println("Maximum Occurance Character: " + maxChar);

	}

}
