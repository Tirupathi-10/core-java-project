package com.CollectionsChartgpt;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 6, 9, 10, 12, 14, 17 };
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int a : arr) {
			list.add(a);
		}

		for (int i = 1; i <= 17; i++) {
			if (!list.contains(i)) {
				list2.add(i);
			}

		}
		System.out.println(list2);
	}

}
