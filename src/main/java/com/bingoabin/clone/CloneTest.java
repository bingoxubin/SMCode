package com.bingoabin.clone;

import com.bingoabin.hashmap.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bingoabin
 * @date 2022/4/30 13:32
 */
public class CloneTest {
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};
		int[] ans = arr.clone();
		ans[1] = 10;
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(arr));

		Person[] person = new Person[3];
		person[0] = new Person(1, "xb");
		person[1] = new Person(2, "xb2");
		person[2] = new Person(3, "xb3");
		Person[] person1 = person.clone();
		person1[0].setId(4);
		System.out.println(print(person));
		System.out.println(print(person1));
	}

	public static String print(Person[] person){
		List<String> res = new ArrayList<>();
		for(int i = 0;i<person.length;i++){
			res.add(person[i].toString());
		}
		return String.join(":", res);
	}
}
