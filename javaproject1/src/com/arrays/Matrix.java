package com.arrays;

public class Matrix {

	public static void main(String[] args) {
		int[][] n = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		int sum1 = 0;
		System.out.println("Matrix: ");
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				sum += n[i][j];
//				System.out.print(n[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if (i == j) {
					sum += n[i][j];
					System.out.print(n[i][j] + " ");
				}
				if (i + j == n.length-1) {
					sum1 += n[i][j];
					System.out.print(n[i][j] + " ");
				}
			}
			System.out.println();
		}

		System.out.println("Sum of All Elements: " + sum);
		System.out.println("Sum of All Elements: " + sum1);
	}

}
