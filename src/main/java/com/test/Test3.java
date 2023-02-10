package com.test;

/**
 * @author bingoabin
 * @date 2022/12/28 21:54
 * @Description:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test3{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		//计算总学分
		String[] sscore = br.readLine().split(" ");
		int count = 0;
		for(int i = 0;i<n;i++) count += Integer.parseInt(sscore[i]);
		//计算总分
		String[] score = br.readLine().split(" ");
		long sum = 0;
		for(int i = 0;i<n;i++){
			int num = Integer.parseInt(score[i]);
			double div = 0;
			if(num >= 90 && num <= 100){
				div = (long) 4.0;
			}else if(num >= 85){
				div = 3.7;
			}else if(num >= 82){
				div = 3.3;
			}else if(num >= 78){
				div = 3.0;
			}else if(num >= 75){
				div = 2.7;
			}else if(num >= 72){
				div = 2.3;
			}else if(num >= 68){
				div = 2.0;
			}else if(num >= 64){
				div = 1.5;
			}else if(num >= 60){
				div = 1.0;
			}else{
				div = 0;
			}
			sum += num * div;
		}
		System.out.printf("%2f",sum/count);
	}
}
