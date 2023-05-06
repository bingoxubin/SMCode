package com.bingoabin.math;

/**
 * @author bingoabin
 * @date 2022/4/27 2:07
 */
public class Math {
	public static void main(String[] args){
		System.out.println(getGreatestCommonDivisorV2(2,3));
	}

	public static int getGreatestCommonDivisorV2(int a, int b){
		int big = a>b ? a:b;
		int small = a<b ? a:b;
		if(big%small == 0){
			return small;
		}
		return getGreatestCommonDivisorV2(big%small, small);
	}
}
