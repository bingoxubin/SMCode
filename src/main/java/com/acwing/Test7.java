package com.acwing;

import java.util.Arrays;

/**
 * @author bingoabin
 * @date 2023/2/28 9:14
 * @Description:
 */
public class Test7 {
	public static void main(String[] args){
		Test7 test7 = new Test7();
		int[] nums = {7, 5, 3, 2, 1, -1};
		System.out.println(test7.firstMissingPositive(nums));
	}

	public int firstMissingPositive(int[] nums) {
		int n = nums.length;
		if (n == 0) return 1;

		for (int i = 0; i < n; i++)
			while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
				swap(nums, i, nums[i] - 1);

		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < n; i++)
			if (nums[i] != i + 1)
				return i + 1;
		return n + 1;
	}

	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
}
