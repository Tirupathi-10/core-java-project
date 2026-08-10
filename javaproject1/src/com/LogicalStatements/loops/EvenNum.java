package com.LogicalStatements.loops;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i != 0 && i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
