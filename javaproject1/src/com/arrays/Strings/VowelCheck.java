package com.arrays.Strings;

public class VowelCheck {

	public static void main(String[] args) {
		String[] s = { "Hyderabad", "Vizag", "chennai", "Vijayawada", "America" };
		int count = 0;

		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>5) {
				count++;
			}
//			if (s[i].charAt(s[i].length() - 1) == 'a' || s[i].charAt(s[i].length() - 1) == 'e'
//					|| s[i].charAt(s[i].length() - 1) == 'i' || s[i].charAt(s[i].length() - 1) == 'o'
//					|| s[i].charAt(s[i].length() - 1) == 'u') {
//				count++;
//
//			}
		}
		System.out.println(count);
	}

}
