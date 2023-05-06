package com.acwing;

/**
 * @author bingoabin
 * @date 2023/2/17 13:42
 * @Description:
 */
public class Test2 {
	public static void main(String[] args){
		Test2 test2 = new Test2();
		int[] nums = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};
		System.out.println(test2.removeDuplicates(nums));
	}

	public int removeDuplicates(int[] nums) {
		int res = 0;
		for(int i = 0;i<nums.length;i++){
			if(nums[res] != nums[i]){
				nums[++res] = nums[i];
			}
		}
		return res+1;
	}
}
