package com.LogicalStatements.loops1;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int temp = n;
		int sq = n * n;
		int last = 1;

		while (temp > 0) {
			last = last * 10;
			temp = temp / 10;
		}
		if (sq % last == n) {
			System.out.println("Given Number is Automorphic Number");
		} else {
			System.out.println("Given Number is Not a Automorphic Number");
		}

	}

}
