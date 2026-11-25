package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class VovelCount {

	public static void main(String[] args) {
		String s = "Hello World";

		Set<Character> s1 = new HashSet<>();
		s1.add('a');
		s1.add('e');
		s1.add('i');
		s1.add('o');
		s1.add('u');
		s = s.toLowerCase();

		int vCount = 0;
		int cCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (s1.contains(ch)) {
					vCount++;
				} else {
					cCount++;
				}

			}

		}
		System.out.println("Vowels Count: " + vCount);
		System.out.println("Consonants Count: " + cCount);
	}

}
