package com.bingoabin.array;

import java.util.Arrays;

/**
 * @author bingoabin
 * @date 2022/5/11 21:11
 */
public class NextArray {
	public static void main(String[] args) {
		int[] arr = {7, 9, 6, 2};
		//{2,2,1,0}
		System.out.println(Arrays.toString(getNext(arr)));
	}

	public static int[] getNext(int[] arr) {
		int[] dp = new int[arr.length];
		dp[arr.length - 1] = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] <= arr[i + 1]) {
				dp[i] = dp[i + 1];
			} else {
				dp[i] = dp[i + 1] + 1;
			}
		}
		return dp;
	}
}
