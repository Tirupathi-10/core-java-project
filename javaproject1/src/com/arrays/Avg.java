package com.arrays;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		double[] marks = new double[size];
		double total_marks = 0;

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the Marks:");
			marks[i] = sc.nextDouble();
		}

		for (double mark : marks) {
			total_marks = total_marks + mark;
		}
		double avg = total_marks / marks.length;
		System.out.println(total_marks);
		System.out.println(avg);
	}

}
