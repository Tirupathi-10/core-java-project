package com.LogicalStatements.loops;

import java.util.Scanner;

public class Factors {

	void factorsInfo(int num) {
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find Factors:");
		int num = sc.nextInt();
		factorsInfo(num);
	}

}
