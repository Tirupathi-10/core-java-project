package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collection03 {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();

		num.add(25);
		num.add(80);
		num.add(45);
		num.add(90);
		num.add(60);
		num.add(75);
		num.add(90);
		num.add(50);

		System.out.println(num);
		int firstlargest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int n : num) {
			if (n > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = n;
			} else if (n > secondlargest && n < firstlargest) {
				secondlargest = n;
			}
		}
		System.out.println("First Largest number is: " + firstlargest);
		System.out.println("Second Largest number is: " + secondlargest);

	}

}
