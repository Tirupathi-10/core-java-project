package com.arrays;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[10];
		int above = 0;
		int below = 0;
		int highest = 0;

		System.out.println("Enter the Marks:");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();

			if (marks[i] >= 40) {
				above++;
			} else {
				below++;
			}
			if (marks[i] > highest) {
				highest = marks[i];
			}
		}
		System.out.println("Students Scored Above or Equal to 40: " + above);
		System.out.println("Students Scored below 40: " + below);
		System.out.println("Highest Marks: " + highest);
		sc.close();

	}

}
