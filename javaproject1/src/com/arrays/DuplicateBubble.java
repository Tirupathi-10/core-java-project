package com.arrays;

import java.util.Arrays;

public class DuplicateBubble {

	public static void main(String[] args) {
		int[] n = { 20, 5, 20, 8, 5, 15, 10 };
		int temp = 0;
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] > n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}

			}

		}
		int large = n[n.length - 3];
		int secondlarge = 0;
		int small = n[2];
		int secondsmall = 0;
		for (int i = n.length - 4; i >= 0; i--) {
			if (n[i] != large) {
				secondlarge = n[i];
				break;
			}
		}
		for (int i = 2; i < n.length; i++) {
			if (n[i] != small) {
				secondsmall = n[i];
				break;
			}
		}
		System.out.println(Arrays.toString(n));
		System.out.println(secondlarge);
		System.out.println(secondsmall);
		
	}

}
