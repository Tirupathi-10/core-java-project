package com.arrays;

public class EvenCount2D {

	public static void main(String[] args) {
		int[][] n = { { 10, 21, 30, 41 }, { 12, 25, 36, 47 }, { 18, 29, 40, 51 }, { 14, 33, 50, 61 } };
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if (n[i][j] % 2 == 0) {
					evencount++;
				} else if (n[i][j] % 2 != 0) {
					oddcount++;
				}
			}
		}
		System.out.println("Even Count: " + evencount);
		System.out.println("Odd Count: " + oddcount);
	}

}
