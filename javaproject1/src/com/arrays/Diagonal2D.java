package com.arrays;

public class Diagonal2D {

	public static void main(String[] args) {
		int[][] n = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110, 120, 130, 140, 150 } };
		for (int i = 0; i < Math.min(n.length, n[0].length); i++) {
			System.out.print(n[i][i] + " ");
		}
	}

}
