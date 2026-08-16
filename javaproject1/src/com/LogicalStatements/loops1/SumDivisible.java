package com.LogicalStatements.loops1;

import java.util.Scanner;

public class SumDivisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int div=findDivisible(n);
		if(div%5==0) {
			System.out.println("Divisible by 5");
		}else {
			System.out.println("Not Divisible by 5");
		}
	}
	static int findDivisible(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}

}
