package com.bingoabin.test;

/**
 * @author bingoabin
 * @date 2022/4/14 11:08
 */
public class TestStatic {
	private static int x, y;

	public static void method() {
		y = x++ + ++x;
	}

	public static void main(String[] args) {
		x--;
		method();
		System.out.println(x + y+ ++x);
	}
}
