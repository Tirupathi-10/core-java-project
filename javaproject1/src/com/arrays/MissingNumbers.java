package com.arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] arr = { -10, 1, 4, 6, 8, 10, 20 };

		for (int i = 0; i < arr.length - 1; i++) {
			int start = arr[i];
			int end = arr[i + 1];
			for (int j = start + 1; j < end; j++) {
				System.out.print(j + " ");
			}
		}
	}

}
