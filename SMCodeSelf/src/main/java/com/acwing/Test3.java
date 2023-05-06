package com.acwing;

import java.util.Arrays;

/**
 * @author bingoabin
 * @date 2023/2/21 14:49
 * @Description:
 */
public class Test3 {
	public static void main(String[] args){
		Test3 test3 = new Test3();
		int[] nums = {1,5,4,3,2};
		test3.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}

	public void nextPermutation(int[] nums) {
		int i = nums.length - 2;
		while(i >= 0 && nums[i] >= nums[i+1]) i--;
		if(i >= 0){
			int j = nums.length -1;
			while(j >= 0 && nums[j] <= nums[i]) j--;
			swap(nums,i,j);
		}
		reverse(nums,i+1);
	}

	public void swap(int[] nums,int left,int right){
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}

	public void reverse(int[] nums,int left){
		int right = nums.length -1;
		while(left < right){
			swap(nums,left++,right--);
		}
	}
}
