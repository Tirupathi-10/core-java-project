package com.arrays;

public class SecondSmall {

	public static void main(String[] args) {
		int[] n1 = { 10, 20, 8, 4, -10, -100, 0, 100 };
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : n1) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}
		System.out.println("Second Smallest Number is: " + secondSmallest);
	}

}
