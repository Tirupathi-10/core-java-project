package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramsSet {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		List<Character> l = new ArrayList<>();
		List<Character> l2 = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {
			l2.add(s1.toLowerCase().charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			l.add(s2.toLowerCase().charAt(i));
		}
		Collections.sort(l);
		Collections.sort(l2);
		if (l.equals(l2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
