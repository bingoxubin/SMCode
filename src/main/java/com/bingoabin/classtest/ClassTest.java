package com.bingoabin.classtest;

/**
 * @author bingoabin
 * @date 2022/5/12 15:05
 */
public class ClassTest {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.bingoabin.classtest.Person");
		Person person = (Person) clazz.newInstance();
		person.setId(1);
		person.setName(2);
		System.out.println(person);
	}
}
