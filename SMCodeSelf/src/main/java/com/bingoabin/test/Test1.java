package com.bingoabin.test;

/**
 * @author bingoabin
 * @date 2022/5/8 10:43
 */
public class Test1 {
	public static void main(String[] args){
		System.out.println(largestGoodInteger("6777133339"));
	}

	public static String largestGoodInteger(String num) {
		String res = "";
		int left = 0;
		int cur = 0;
		int len = num.length();
		while(left < len -2 && cur < len){
			while(cur+1 < len && num.charAt(cur) == num.charAt(cur+1)){
				cur ++;
			}
			if(cur - left >= 2){
				String temp = num.substring(left,left + 3);
				System.out.println(temp);
				if(temp.compareTo(res) > 0){
					res = temp;
				}
			}
			left ++;
			cur = left;
		}

		return res;
	}
}
