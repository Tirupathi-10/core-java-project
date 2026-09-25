package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineStudentPortal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException ne) {
			System.out.println("Null pointer Exception in catch");
		}

		try {
			System.out.println("Enter the Age");
			int age = sc.nextInt();
		} catch (InputMismatchException ie) {
			System.out.println("Input Mismatch Exception in catch");

		}

		try {
			System.out.println("Enter the Number of Subjects: ");
			int sub = sc.nextInt();
			double totalmarks = 0;
			System.out.println("Enter the size:");
			int size = sc.nextInt();
			System.out.println("Enter the marks:");
			int[] marks = new int[size];
			for (int i = 0; i < marks.length; i++) {
				marks[i] = sc.nextInt();
				totalmarks = totalmarks + marks[i];
			}
			System.out.println(totalmarks);
			double avg = totalmarks / sub;
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception in catch");
		}
		

	}

}