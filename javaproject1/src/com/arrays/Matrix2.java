package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[][] n = new int[size][size];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				n[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if (n[i][j] % 2 == 0) {
					n[i][j] = 0;
				} else {
					n[i][j] = -1;
				}
			}
		}

		System.out.print(Arrays.deepToString(n));
	}

}


