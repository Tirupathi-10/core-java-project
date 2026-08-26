package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("Enter the Elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr[i].length - 1;
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length / 2; j++) {
					int temp = arr[i][start];
					arr[i][start] = arr[i][end];
					arr[i][end] = temp;
					start++;
					end--;
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					if (i % 2 != 0 && i != j) {
						arr[i][j] *= 2;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][i] *= arr[i][i];
				}
			}
		}
		System.out.print(Arrays.deepToString(arr));

	}

}
