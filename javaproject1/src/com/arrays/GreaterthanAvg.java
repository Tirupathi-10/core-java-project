package com.arrays;

public class GreaterthanAvg {

	public static void main(String[] args) {
		int[] n = { 10, 30, 40, 50, 80, 45 };
		double total = 0;
		double avg = 0;
		int abovecount = 0;
		int belowcount = 0;
		for (int i = 0; i < n.length; i++) {
			total += n[i];
		}
		avg = total / n.length;
		for (int num : n) {
			if (num > avg) {
				abovecount++;
			}
			if (num < avg) {
				belowcount++;
			}
		}
		System.out.println("Average: " + avg);
		System.out.println("Above Count: " + abovecount);
		System.out.println("Below Count: " + belowcount);
	}

}
