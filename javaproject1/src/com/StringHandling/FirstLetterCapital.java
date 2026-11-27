package com.StringHandling;

import java.util.Scanner;

public class FirstLetterCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 || str.charAt(i - 1) == ' ') {
				if (ch >= 'a' && ch <= 'z') {
					ch = (char) (ch - 32);
				}
			}
			rev += ch;
		}
		System.out.println("String :" + rev);

	}

}
