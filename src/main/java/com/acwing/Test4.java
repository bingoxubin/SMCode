package com.acwing;

/**
 * @author bingoabin
 * @date 2023/2/21 16:39
 * @Description:
 */
public class Test4 {
	public static void main(String[] args) {
		int[] nums = {5, 6, 7, 8, 9, 5, 5, 5, 5, 5, 5};
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int mid = (r - l) / 2 + l;
			if (nums[mid] > nums[0]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		System.out.println(r);

		System.out.println(test(nums,0,4,10));
	}

	public static int test(int[] nums, int l, int r, int target) {
		while (l <= r) {
			int mid = (r - l) / 2 + l;
			if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return r;
	}
}
