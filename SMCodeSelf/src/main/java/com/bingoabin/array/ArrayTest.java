package com.bingoabin.array;

import java.util.Arrays;

/**
 * @author bingoabin
 * @date 2022/5/2 11:25
 */
public class ArrayTest {
	public static void main(String[] args){
		String str = "abbcac";
		System.out.println(appealSum(str));
	}

	public static long appealSum(String s) {
		int n = s.length();
		char[] chs = s.toCharArray();
		int[] indexOfLastSame = new int[n], lastAppear = new int[26];
		Arrays.fill(lastAppear, -1);
		for (int i = 0; i < n; i++) {
			indexOfLastSame[i] = lastAppear[chs[i] - 'a'];
			lastAppear[chs[i] - 'a'] = i;
		}
		long pre = 1L, res = 1L;
		for (int i = 1; i < n; i++) {
			pre += i - indexOfLastSame[i];
			res += pre;
		}
		System.out.println();
		return res;
	}
}
