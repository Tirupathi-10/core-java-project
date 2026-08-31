package com.arrays;

public class RowSum {

	public static void main(String[] args) {
		int[][] n = { { 10, 20, 30, 40 }, { 10, -100, 80, 40 }, { 10, 20, 30, 90 }, { 10, 20, 30, 40 } };

		for (int j = 0; j < n.length; j++) {
			int sum = 0;
			for (int i = 0; i < n[j].length; i++) {
				sum = sum + n[i][j];
			}

			System.out.println(sum);
		}
	}

}
