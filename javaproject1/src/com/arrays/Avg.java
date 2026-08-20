package com.arrays;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int[] num = new int[size];
		int sum = 0;
		System.out.println("Enter the Elements: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum of Elements:" + sum);
//		double avg = sum / num.length;
//		System.out.println("Average: " + avg);

	}

}
