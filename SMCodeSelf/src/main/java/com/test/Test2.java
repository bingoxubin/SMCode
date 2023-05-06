package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author bingoabin
 * @date 2022/12/21 11:49
 * @Description:
 */
public class Test2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] cows = new int[n][2];
		for(int i = 0;i<n;i++){
			int w = sc.nextInt();
			int s = sc.nextInt();
			cows[i] = new int[]{w + s,w};
		}

		Arrays.sort(cows, new Comparator<int[]>(){
			public int compare(int[] a,int[] b){
				return a[0] - b[0];
			}
		});
		int sum = 0;
		int res = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++){
			int w = cows[i][1];
			int s = cows[i][0] - w;
			res = Math.max(res,sum - s);
			sum += w;
		}
		System.out.println(res);
	}
}
