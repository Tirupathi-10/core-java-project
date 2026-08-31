package com.arrays;

public class ReversePrint {

	public static void main(String[] args) {
		int[] a = { 3, 5, 6, 7, 8, 9, 2 };

		for (int i = a.length - 1; i > 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
