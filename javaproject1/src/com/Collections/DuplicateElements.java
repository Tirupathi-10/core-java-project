package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3,7, 1 };
		Stack<Integer> s = new Stack<>();
		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (!s.contains(arr[i])) {
				s.push(arr[i]);
			} else {
				l.add(arr[i]);
			}
		}
		System.out.println(l);

	}

}
