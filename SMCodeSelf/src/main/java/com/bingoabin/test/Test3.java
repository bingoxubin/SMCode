package com.bingoabin.test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @author bingoabin
 * @date 2022/5/9 17:28
 */
public class Test3 {
	public static void main(String[] args){
		System.out.println(countTexts("22233"));
		Deque<Integer> queue = new LinkedList<>();
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
	}

	private static final int mod = 1000000007;

	public static int countTexts(String pressedKeys) {
		char[] keys = pressedKeys.toCharArray();
		int n = keys.length;

		int[] ans = new int[n];
		ans[0] = 1;
		for (int i = 1; i < n; i++) {
			ans[i] = ans[i-1];
			int offset = (keys[i] == '7' || keys[i] == '9') ? 4 : 3;
			for (int j = 1; j < offset; j++) {
				if (i < j || keys[i] != keys[i-j]) break;
				ans[i] += (i == j) ? 1 : ans[i-j-1];
				ans[i] %= mod;
			}
		}
		System.out.println(Arrays.toString(ans));
		return ans[n-1];
	}
}
