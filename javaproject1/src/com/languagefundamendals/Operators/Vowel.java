package com.languagefundamendals.Operators;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Vowel:");
		char s=sc.next().charAt(0);
		String vowel=(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u')?"Vowel":"Consonent";
		System.out.println("result:"+vowel);
		}

}
