package com.LogicalStatements.loops1;

import java.util.Scanner;

public class SumandDivisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=findSum(n);
		System.out.println(sum);

		
	}
	static int findSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
			sum+=rem;
			}
			n=n/10;
		}
		return sum;
	}

}
