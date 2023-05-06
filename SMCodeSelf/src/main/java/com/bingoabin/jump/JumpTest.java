package com.bingoabin.jump;

/**
 * @author bingoabin
 * @date 2022/4/21 17:30
 */
public class JumpTest {
	public static void main(String[] args){
		int[] arr = {3, 2, 1, 0, 4};
		System.out.println(new JumpTest().canJump(arr));
	}

	public boolean canJump(int[] nums) {
		int[] jump = new int[nums.length];
		for(int i = 0;i<nums.length;i++){
			jump[i] = nums[i] + i;
		}
		int index = 0;
		int maxJump = jump[0];
		while(index < jump.length && index <= maxJump){
			if(maxJump < jump[index]){
				maxJump = jump[index];
			}
			index ++;
		}
		if(index == nums.length) return true;
		return false;
	}
}
