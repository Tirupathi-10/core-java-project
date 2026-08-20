package com.arrays;

public class IndexBasedSum {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 50, 20 };
		int evenIndexSum = 0;
		int oddIndexSum = 0;

		System.out.print("Even Index Numbers:");
		for (int i = 0; i < numbers.length; i = i + 2) {
			System.out.print(numbers[i] + " ");
			evenIndexSum += numbers[i];
		}
		System.out.println();
		System.out.print("Odd Index Numbers:");
		for (int i = 1; i < numbers.length; i = i + 2) {
			System.out.print(numbers[i] + " ");
			oddIndexSum += numbers[i];
		}
		System.out.println();
		System.out.println("Even Index Sum: " + evenIndexSum);
		System.out.println("Odd Index Sum: " + oddIndexSum);
	}

}
