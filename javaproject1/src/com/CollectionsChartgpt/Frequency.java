package com.CollectionsChartgpt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 20, 10 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int n : arr) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);

			} else {
				map.put(n, 1);
			}
		}
		Set<Entry<Integer, Integer>> entries = map.entrySet();
		for (Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
