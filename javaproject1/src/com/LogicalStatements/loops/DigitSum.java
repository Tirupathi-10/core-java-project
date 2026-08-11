package com.LogicalStatements.loops;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		 int sum= sumofDigits(n);
		 System.out.println("Digit of the Number is :"+sum);
	}
	static int sumofDigits(int n) {
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			n=n/10;
			sum+=rem;
		}
		return sum;
	}

}
