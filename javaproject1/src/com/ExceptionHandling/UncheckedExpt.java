package com.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class UncheckedExpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String s1 = sc.next();
		System.out.println("Enter the String 2:");
		String s2 = sc.next();

		try {
			int num1 = Integer.parseInt(s1);
			int num2 = Integer.parseInt(s2);
			System.out.println(num1 / num2);
			int[] arr = { 10, 20, 30, 40, 50 };
			System.out.println("Enter The Arrar Index:");
			int index = sc.nextInt();
			System.out.println(arr[index]);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (NumberFormatException ne) {
			ne.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}

	}

}
