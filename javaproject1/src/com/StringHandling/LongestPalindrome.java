
package com.StringHandling;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.next().toLowerCase();

		String longest = "";

		for (int i = 0; i < str.length(); i++) {

			for (int j = i+1; j <= str.length(); j++) {
				String sub = str.substring(i, j);

				String rev = "";

				for (int k = sub.length() - 1; k >= 0; k--) {
					rev += sub.charAt(k);
				}
				if (rev.equals(sub) && sub.length() > longest.length()) {
					longest = sub;
				}
			}

		}
		System.out.println("the Longest String is: " + longest);
	}
}
