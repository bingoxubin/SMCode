package com.bingoabin.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bingoabin
 * @date 2022/5/8 18:07
 */
public class Test2 {
	public static void main(String[] args){
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(findDuplicates(nums));
	}

	public static List<Integer> findDuplicates(int[] nums){
		int len = nums.length;
		for(int i = 0;i<len;i++){
			while(nums[i] != nums[nums[i] - 1]){
				swap(nums,i,nums[i] - 1);
			}
		}
		System.out.println(Arrays.toString(nums));
		List<Integer> res = new ArrayList<>();
		for(int i = 0;i<len;i++){
			if(nums[i] - 1 != i){
				res.add(nums[i]);
			}
		}
		return res;
	}

	public static void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
