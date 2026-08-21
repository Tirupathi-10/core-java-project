package com.arrays;

public class LargeEle2D {

	public static void main(String[] args) {
		int[][] n = { { 10, 20, 30, 40 }, { 10, -100, 80, 40 }, { 10, 20, 30, 90 }, { 10, 20, 30, 40 } };
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;

		for (int[] n1 : n) {
			for (int num : n1) {
				if (num > large) {
					large = num;
				} else if (num < small) {
					small = num;
				}
			}

		}
		System.out.println(large);
		System.out.println(small);

	}

}
