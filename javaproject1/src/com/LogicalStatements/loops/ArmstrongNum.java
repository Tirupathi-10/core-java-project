package com.LogicalStatements.loops;

import java.util.Scanner;

public class ArmstrongNum {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if (status) {
			System.out.println("Given Number is as Armstrong Number");
		} else {
			System.out.println("Given Number is Not a Armstrong Number");
		}
	}

	boolean isArmstrong(int n) {
		boolean status = false;
		int temp = n;
		int sum = 0;
		String count = Integer.toString(n);
		int digitcount = count.length();
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + Math.powExact(rem, digitcount);
		}
		if (sum == temp) {
			status = true;
		}
		return status;
	}

}
