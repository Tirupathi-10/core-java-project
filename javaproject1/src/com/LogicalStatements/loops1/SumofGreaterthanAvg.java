package com.LogicalStatements.loops1;

import java.util.Scanner;

public class SumofGreaterthanAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=findSum(n);
		System.out.println(sum);
	}
	static int findSum(int n) {
		int sum=0;
		int count=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
			count++;
			
			double avg=(double)sum/count;
			if(rem>avg) {
				sum+=rem;
			}
		}
		return sum;
	}

}
