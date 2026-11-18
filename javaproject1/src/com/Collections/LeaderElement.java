package com.Collections;

import java.util.Stack;

public class LeaderElement {

	public static void main(String[] args) {

		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		int max = arr[n - 1];
		Stack<Integer> s = new Stack<>();
		s.push(max);

		for (int a = n - 2; a >= 0; a--) {
			if (arr[a] > max) {
				s.push(arr[a]);
				max = arr[a];
			}
		}
		while (!s.empty()) {
			System.out.println(s.pop() + " ");
		}

	}

}
