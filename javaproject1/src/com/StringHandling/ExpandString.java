package com.StringHandling;

public class ExpandString {
	public static void main(String[] args) {

		String str = "a2b17c3";
		String result = "";

		for (int i = 0; i < str.length();) {

			char ch = str.charAt(i);
			i++;

			int count = 0;

			while (i < str.length() && Character.isDigit(str.charAt(i))) {

				count = count * 10 + (str.charAt(i) - '0');
				i++;
			}

			for (int j = 1; j <= count; j++) {
				result = result + ch;
			}
		}

		System.out.println(result);
	}
}
