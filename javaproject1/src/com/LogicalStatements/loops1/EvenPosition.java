package com.LogicalStatements.loops1;

import java.util.Scanner;

public class EvenPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=evenPosition(n);
		System.out.println(sum);
	}
	static int evenPosition(int n) {
		int sum=0;
		int position=1;
		while(n>0) {
			 int rem=n%10;
			if(position%2==0) {
				sum+=rem;
			}
			n=n/10;
			position++;
		}
		return sum;
	}

}
