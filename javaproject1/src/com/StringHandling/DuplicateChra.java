package com.StringHandling;

public class DuplicateChra {

	public static void main(String[] args) {
		String str = "programming";
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str1.indexOf(c) == -1) {
				str1 += c;
			}
		}
		System.out.println(str1);
	}
}
