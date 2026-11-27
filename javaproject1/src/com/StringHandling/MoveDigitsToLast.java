package com.StringHandling;

import java.util.Scanner;

//Move all digits to the end without changing the order of other characters.
//Input: a1b2c3d
//Output: abcd123

public class MoveDigitsToLast {

	public static String moveLast(String str) {
		StringBuilder digit = new StringBuilder();

		StringBuilder nonDigit = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				digit.append(ch);
			} else {
				nonDigit.append(ch);
			}
		}

		return nonDigit.append(digit).toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();

		String str2=moveLast(str);
		System.out.println(str2);
		
		

	}

}
