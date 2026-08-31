package com.arrays;

import java.util.Arrays;

public class LargeBubble {

	public static void main(String[] args) {
		int[] n = { 12, 45, 7, 89, 23, 56 };
		int temp = 0;
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < n.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] < n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(n));
		System.out.println("Largest: " + n[0]);
		System.out.println("Smallest: " + n[n.length - 1]);
		System.out.println("Second Largest: " + n[1]);
		System.out.println("Second Smallest: " + n[n.length - 2]);
	}

}
