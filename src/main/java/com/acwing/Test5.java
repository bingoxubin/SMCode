package com.acwing;

/**
 * @author bingoabin
 * @date 2023/2/21 17:26
 * @Description:
 */
public class Test5 {
	public static void main(String[] args) {
		int[] nums = {3, 1};
		int target = 3;
		System.out.println(search(nums,3));
	}

	public static int search(int[] nums, int target) {
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

		if (target > nums[0]) {
			l = 0;
			if(r == -1) r = nums.length - 1;
		} else {
			l = r + 1;
			r = nums.length - 1;
		}

		while (l <= r) {
			int mid = (r - l) / 2 + l;
			if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		if (r >= nums.length || r < 0) return -1;
		if (nums[r] == target) return r;
		else return -1;
	}
}
