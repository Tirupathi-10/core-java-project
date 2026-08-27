package com.arrays;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int[] n = new int[size];

		for (int i = 0; i < n.length; i++) {
			System.out.println("Enter the Elements: ");// 10,20,40,30,50
			n[i] = sc.nextInt();
		}
		int largest = Integer.MIN_VALUE;
		int secondlarge = Integer.MIN_VALUE;
		for (int num : n) {
			if (num > largest) {
				secondlarge = largest;
				largest = num;
			} else if (num > secondlarge && num != largest) {
				secondlarge = num;
			}
		}
		System.out.println(secondlarge);
	}

}
