package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesSet {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 10 };
		int[] arr1 = { 1, 4, 10 };
		int[] arr2 = { 1, 6, 10 };
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (!set.contains(arr[i][j])) {
//					set.add(arr[i][j]);
//				} else {
//					set1.add(arr[i][j]);
//				}
//
//			}
//
//		}
//		System.out.println("set: " + set);
//		System.out.println("set: " + set1);
		for (int n : arr) {
			set1.add(n);
		}
		for (int n : arr1) {
			set2.add(n);
		}
		for (int n : arr2) {
			set3.add(n);
		}
		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println(set1);
	}

}
