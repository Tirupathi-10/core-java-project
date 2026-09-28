package com.ExceptionHandling;

import java.util.Scanner;

public class ATMexce {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the String:");
			String s = sc.next();
			double n = Double.parseDouble(s);
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException in Catch");

		}
		try {
			String[] s1 = { "java", "full", "stack" };
			System.out.println("Enter the String index:");
			int index = sc.nextInt();
			System.out.println(s1[index]);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException in Catch");
		}
		try {

			String s2 = null;
			System.out.println(s2.toUpperCase());
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException in catch");
		}
		System.out.println("main method ended");
		sc.close();

	}
}
