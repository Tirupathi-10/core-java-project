package com.arrays;

public class LargeEven {

	public static void main(String[] args) {
		int[] num = { 10, 20, 37, 55, 86, 90, 89, -12, -90, -17 };
		int evenlarge = Integer.MIN_VALUE;
		int oddsmall = Integer.MAX_VALUE;
		for (int n : num) {
			if (n < oddsmall && n % 2 != 0) {
				oddsmall = n;
			}
			if (n > evenlarge && n % 2 == 0) {
				evenlarge = n;
			}
		}
		System.out.println(evenlarge);
		System.out.println(oddsmall);
	}

}
