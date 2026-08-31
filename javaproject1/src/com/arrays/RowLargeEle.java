package com.arrays;

public class RowLargeEle {

	public static void main(String[] args) {
		int[][] n = { { 10, 20, 30, 40 }, { 10, -100, 80, 40 }, {- 10, 20, 30, 90 }, { 10, 20, 30, 40 } };

		for (int i = 0; i < n.length; i++) {
			int large = Integer.MIN_VALUE;
			for (int j = 0; j < n[i].length; j++) {
				if (n[i][j] > large) {
					large = n[i][j];
				}
			}
			System.out.print(large + " ");
		}
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			int small = Integer.MAX_VALUE;
			for (int j = 0; j < n[i].length; j++) {
				if (n[i][j] < small) {
					small = n[i][j];
				}
			}
			System.out.print(small + " ");
		}
	}

}
