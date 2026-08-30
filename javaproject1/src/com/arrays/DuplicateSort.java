package com.arrays;

import java.util.Scanner;

public class DuplicateSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] n = new int[size];
		System.out.println("Enter the Elements");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		for (int i = 0; i < n.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.print(n[i] + " ");
			}
		}
	}

}
