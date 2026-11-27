package com.StringHandling;


public class ArrangeWordsBasedOnNum {

	public static void main(String[] args) {

		String str = "going3 to4 Hyderabad5 i1 am2";

		String[] words = str.split(" ");

		String[] result = new String[words.length];

		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			int num = word.charAt(word.length() - 1) - '0';

			String actualWord = word.substring(0, word.length() - 1);

			result[num - 1] = actualWord;
		}

		for (int i = 0; i < result.length; i++) {

			System.out.print(result[i] + " ");
		}

		
	}
}