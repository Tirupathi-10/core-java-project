package com.arrays;

import java.util.Scanner;

public class PosandNegcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size");
		int n = sc.nextInt();
		int[] num = new int[n];
		int pos = 0;
		int neg = 0;
		int zero=0;
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter the Numbers");
			num[i] = sc.nextInt();
		}
		for (int n1 : num) {
			if (n1 > 0) {
				pos++;
			} else if(n1<0) {
				neg++;
			}else {
				zero++;
			}
		}
		System.out.println("Number of Positive Numbers: " + pos);
		System.out.println("Number of Negative Numbers: " + neg);
		System.out.println("Number of Zero's: "+zero);
	}

}
