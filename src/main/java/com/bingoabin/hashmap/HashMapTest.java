package com.bingoabin.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author bingoabin
 * @date 2022/4/23 13:34
 */
public class HashMapTest {
	public static void main(String[] args){
		Map<Integer, Integer> hashmap = new HashMap<>();
		hashmap.put(1, 8);
		hashmap.put(2, 7);
		hashmap.put(3, 6);
		hashmap.put(4, 5);
		hashmap.put(5, 4);
		hashmap.put(6, 3);
		hashmap.put(7, 2);
		hashmap.put(8, 1);
		PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(5, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
	}
}
