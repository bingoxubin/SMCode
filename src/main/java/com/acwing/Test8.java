package com.acwing;

import java.util.Arrays;

/**
 * @author bingoabin
 * @date 2023/2/28 10:00
 * @Description:
 */
public class Test8 {
	public static void main(String[] args){
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		Test8 test8 = new Test8();
		System.out.println(test8.trap(height));
		System.out.println();
	}

	public int trap(int[] height) {
		int sum = 0;
		int[] max_left = new int[height.length];
		int[] max_right = new int[height.length];

		for (int i = 1; i < height.length - 1; i++) {
			max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
		}
		System.out.println(Arrays.toString(max_left));
		for (int i = height.length - 2; i > 0; i--) {
			max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
		}
		System.out.println(Arrays.toString(max_right));
		for (int i = 1; i < height.length - 1; i++) {
			int min = Math.min(max_left[i], max_right[i]);
			if (min > height[i]) {
				sum = sum + (min - height[i]);
			}
		}
		return sum;
	}
}
