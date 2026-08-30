package com.arrays;

public class Frequency {

	public static void main(String[] args) {
		int[] n = { 10, 20, 10, 30, 20, 10, 40 };

		for (int i = 0; i < n.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				int count = 0;
				for (int j = 0; j < n.length; j++) {
					if (n[i] == n[j]) {
						count++;
					}
				}

				System.out.println(n[i] + "---> " + count);
			}
		}
	}

}
