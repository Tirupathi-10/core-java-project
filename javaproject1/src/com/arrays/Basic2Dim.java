package com.arrays;

public class Basic2Dim {

	public static void main(String[] args) {
		double[][] arr = new double[5][4];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;

		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;

		arr[2][0] = 10;
		arr[2][1] = 11;
		arr[2][2] = 12;
		arr[2][3] = 13;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}
}
