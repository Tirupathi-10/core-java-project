package com.arrays.Strings;

public class LongestString {

	public static void main(String[] args) {
		String[] s = { "Hyderabad", "Vizag", "chennai", "Vijayawada" };
		String longest = s[0];
		String smallest = s[0];

		for (int i = 1; i < s.length; i++) {
			if (s[i].length() > longest.length()) {
				longest = s[i];
			}
			if (s[i].length() < smallest.length()) {
				smallest = s[i];
			}
		}
		System.out.println(longest);
		System.out.println(smallest);
	}

}
