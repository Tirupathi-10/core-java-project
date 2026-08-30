package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] n = { 5, 2, 8, 1, 3 };
		int temp = 0;
		int count = 0;
		int count1 = 0;
		int swapcount=0;
		System.out.println(Arrays.toString(n));
 		for (int i = 0; i < n.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] < n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
					swapcount++;
					flag = true;
				}
				count1++;
			}
			count++;

			if (!flag) {
				break;
			}
		}
		System.out.println("Swap Count: "+swapcount);
		System.out.println("Count: " + count);
		System.out.println("Count: " + count1);
		System.out.println(Arrays.toString(n));
	}

}
