package com.bingoabin.dp;

/**
 * @author bingoabin
 * @date 2022/4/30 23:05
 */
public class DpTest {
	public static void main(String[] args){
		int[][] guards = {{0, 0}, {1, 1}, {2, 3}};
		int[][] walls = {{0, 1}, {2, 2}, {1, 4}};
		System.out.println(countUnguarded(4,6,guards,walls));
	}

	public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
		int[][] dp = new int[m][n];
		for(int[] guard:guards){
			dp[guard[0]][guard[1]] = 1;
		}
		for(int[] wall:walls){
			dp[wall[0]][wall[1]] = -1;
		}
		int[] x = {0,0,-1,1};
		int[] y = {-1,1,0,0};
		for(int[] guard:guards){
			for(int i = 0;i<4;i++){
				int dx = guard[0] + x[i];
				int dy = guard[1] + y[i];
				//G 表示为 1  W 表示为 -1 能监控到的表示为2
				while(dx >= 0 && dx < m && dy >= 0 && dy < n && dp[dx][dy] != -1){
					dp[dx][dy] = 2;
					dx += x[i];
					dy += y[i];
				}
			}
		}

		int count = 0;
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(dp[i][j] == 0){
					count++;
				}
			}
		}
		return count;
	}
}
