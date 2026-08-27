package com.arrays;

public class Sum2D {

	public static void main(String[] args) {
		int[][] n = { { 10, 20, 30, 40 }, { 10, 20, 30, 40 }, { 10, 20, 30, 40 }, { 10, 20, 30, 40 } };

//		n[0][0] = 10;
//		n[0][1] = 20;
//		n[0][2] = 30;
//		n[0][3] = 40;
//
//		n[1][0] = 50;
//		n[1][1] = 10;
//		n[1][2] = 20;
//		n[1][3] = 30;
//
//		n[2][0] = 10;
//		n[2][1] = 1;
//		n[2][2] = 13;
//		n[2][3] = 15;

		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				sum = sum + n[i][j];
			}
		}
		System.out.println(sum);
	}

}
