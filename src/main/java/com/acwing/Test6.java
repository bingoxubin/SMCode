package com.acwing;

/**
 * @author bingoabin
 * @date 2023/2/21 18:40
 * @Description:
 */
public class Test6 {
	public static void main(String[] args){
		int[] nums = {3, 1, 2};
		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int res = 0;
		while(low <= high){
			int mid = (high - low) / 2 + low;
			if(nums[mid] < nums[high]){
				res = mid;
				high = mid -1;
			}else{
				low = mid + 1;
			}
		}
		return nums[res];
	}
}
