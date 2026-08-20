package com.arrays;

public class LargestElement {

	public static void main(String[] args) {
		int[] num = { 10, 20, 25, 31, 67, 90, 45, 40 };
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int n : num) {
			if (n > largest) {
				largest = n;
			}
			if (n < smallest) {
				smallest = n;
			}
		}
		System.out.println("The Largest Number is: " + largest);
		System.out.println("The Smallest Number is: " + smallest);
		int difference = largest - smallest;
		System.out.println("Difference: " + difference);
	}

}
