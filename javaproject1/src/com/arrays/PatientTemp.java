package com.arrays;

import java.util.Scanner;

public class PatientTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Patients: ");
		int size = sc.nextInt();
		double[] temp = new double[size];
		System.out.println("Enter the Temperature:");

		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextDouble();
		}
		double highTemp = temp[0];
		double lowTemp = temp[0];
		int feverCount = 0;
		double sum = 0;

		for (int i = 0; i < temp.length; i++) {

			if (temp[i] > highTemp) {
				highTemp = temp[i];
			} else if (temp[i] < lowTemp) {
				lowTemp = temp[i];
			}
			if (temp[i] >= 100.4) {
				feverCount++;
			}
			sum += temp[i];

		}
		double avg = sum / temp.length;

		System.out.println("High Temperature: " + highTemp + "℉");
		System.out.println("Low Temperature: " + lowTemp + "℉");
		System.out.println("Fever Count: " + feverCount);
		System.out.println("Average: " + avg);

	}
}
