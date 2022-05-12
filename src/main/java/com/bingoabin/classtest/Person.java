package com.bingoabin.classtest;

/**
 * @author bingoabin
 * @date 2022/5/12 15:06
 */
public class Person {
	private int id;
	private int name;

	public Person(int id, int name) {
		this.id = id;
		this.name = name;
	}

	public Person() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;

		if (id != person.id) return false;
		return name == person.name;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + name;
		return result;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name=" + name +
				'}';
	}
}
