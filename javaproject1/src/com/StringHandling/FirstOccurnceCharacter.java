package com.StringHandling;

import java.util.Scanner;

public class FirstOccurnceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "swiss";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (name.indexOf(c) == name.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}

}
