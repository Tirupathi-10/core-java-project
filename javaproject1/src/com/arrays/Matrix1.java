package com.arrays;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] n = new int[3][3];
		System.out.println("Enter the Elements:");

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		System.out.println("Matrix: ");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				sum += n[i][j];
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of All Elements: " + sum);
	}

}
