package com.bingoabin.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bingoabin
 * @date 2022/4/24 23:49
 */
public class Test {
	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<>();
		Person person = new Person(1, "xb");
		map.put(person, 1);
		System.out.println(map.get(person));
		person.setId(2);
		System.out.println(map.get(person));
	}
}
