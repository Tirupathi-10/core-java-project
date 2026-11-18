package com.CollectionsChartgpt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenRemove {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30, 35, 40 };

		List<Integer> list = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		
		for (int n : arr) {
			if (n % 2 == 0) {
				list.add(n);
			} else {
				li.add(n);
			}
		}
		System.out.println(li);

	}
}
