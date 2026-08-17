package com.arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
//		int[] arr = { 10, 30, 4, 6, 10, 30, 55, 20, 40, 8 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Elements: " + arr[i]);
					break;
				}
			}
		}
	}

}
