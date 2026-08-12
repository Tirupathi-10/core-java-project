package com.LogicalStatements.loops1;

import java.util.Scanner;

public class DigitSumAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=sumofDigit(n);
		int count=digitCount(n);
		double avg=(double)sum/count;
		System.out.println(avg);
	}
	static int sumofDigit(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
			
		}
		return sum;
	}
	static int digitCount(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
