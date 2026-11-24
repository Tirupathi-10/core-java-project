package com.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = sc.next();
		System.out.println("Enter the second string:");
		String str2 = sc.next();

		if (str1.length() != str2.length()) {
			System.out.println("Given String is not Anagrams");
		}

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Given String is Anagram");
		} else {
			System.out.println("Given String is not anagram");
		}
	}

}
