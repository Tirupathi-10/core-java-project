package com.arrays;

import java.util.Arrays;

public class Copy1and2 {

	public static void main(String[] args) {
		int[] a = { 5, 3, 7, 8, 9, 3, 2, };
		int[] b = { 4, 5, 6, 4, 9, 7, 1, };

		int len = 0;

		if (a.length > b.length) {
			len = a.length;
		} else {
			len = b.length;
		}

		int[] c = new int[len];
		for (int i = 0; i < len; i++) {
			if (a.length <= i) {
				c[i] = b[i];
			} else if (b.length <= i) {
				c[i] = a[i];
			} else {
				c[i] = a[i] + b[i];
			}
		}

//		int[] c = new int[a.length + b.length];
//		for (int i = 0; i < a.length; i++) {
//			c[i] = a[i];
//		}
//		for (int i = 0; i < b.length; i++) {
//			c[a.length+i] = b[i];
//		}

//		for(int i=0;i<b.length;i++) {
//			c[i]=a[i]+b[i];
//		}
		System.out.println(Arrays.toString(c));
	}

}
