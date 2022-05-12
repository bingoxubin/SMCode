package com.bingoabin.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bingoabin
 * @date 2022/5/10 22:08
 */
public class SubSetTest {
	public static void main(String[] args){
		int[] arr = {1, 2, 3};
		SubSetTest subSetTest = new SubSetTest();
		System.out.println(subSetTest.subsets(arr));
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		dfs(nums,0,new ArrayList<>(),res);
		return res;
	}

	public void dfs(int[] nums,int index,List<Integer> path,List<List<Integer>> res){
		if(index <= nums.length){
			res.add(new ArrayList<>(path));
		}
		for(int i = index;i<nums.length;i++){
			path.add(nums[i]);
			dfs(nums,i+1,path,res);
			path.remove(path.size() -1);
		}
	}
}
