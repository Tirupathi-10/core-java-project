package com.CollectionsChartgpt;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 40, 10, 50 };
		Set<Integer> set = new LinkedHashSet<>();
		

//		for (int a : arr) {
//			if (!set.contains(a)) {
//				set.add(a);
//			} else {
//				list.add(a);
//			}
//
//		}
		for (int a : arr) {
			set.add(a);
		}
		List<Integer> list = new ArrayList<>(set);

		System.out.println(list);

	}

}
