package com.bingoabin.test;

import java.util.Arrays;
import java.util.stream.Collectors;

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
		int[] arr = {1, 2, 3, 4, 5};
		String res = String.join(".", Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.toList()));
		System.out.println(res);
		x--;
		method();
		System.out.println(x + y+ ++x);
	}
}
