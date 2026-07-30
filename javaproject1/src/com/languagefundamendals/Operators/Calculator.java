package com.languagefundamendals.Operators;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the Operator:");
		char op = sc.next().charAt(0);
		int result = (op == '+') ? num1 + num2 : num1 - num2;
		System.out.println("result:" + result);
		sc.close();
		
	}

}
