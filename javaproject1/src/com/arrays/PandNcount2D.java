package com.arrays;

public class PandNcount2D {

	public static void main(String[] args) {
		int[][] n = { { 10, -20, 30, -40 }, { -5, 15, -25, 35 }, { 2, -90, 6, -8 }, { -50, 3, -5, 7 } };
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if (n[i][j] > 0) {
					pos++;
				} else if (n[i][j] < 0) {
					neg++;
				} else {
					zero++;
				}
			}
		}
		System.out.println("Positive Count: " + pos);
		System.out.println("Negative Count: " + neg);
		System.out.println("Zero's Count: " + zero);
	}

}
