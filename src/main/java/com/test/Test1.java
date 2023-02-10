package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author bingoabin
 * @date 2022/12/20 22:52
 * @Description:
 */
public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++){
			int num = sc.nextInt();
			getNum(num);
		}
	}

	public static void getNum(int num){
		List<Integer> res = new ArrayList<>();
		for(int i = 1;i <= Math.sqrt(num);i++){
			if(num % i == 0){
				res.add(i);
				if(i != num / i) res.add(num / i);
			}
		}
		Collections.sort(res);
		for(int i = 0;i<res.size();i++){
			System.out.printf("%s ",res.get(i));
		}
		System.out.println();
	}
}
