package com.bingoabin.test;

import java.util.Arrays;

public class Test4 {
	public static void main(String[] args) {
		int[][] grid = {{5, 3}, {4, 0}, {2, 1}};
		int[][] moveCost = {{9, 8}, {1, 5}, {10, 12}, {18, 6}, {2, 4}, {14, 3}};
		Test4 test4 = new Test4();
		test4.minPathCost(grid, moveCost);
	}

	public int minPathCost(int[][] grid, int[][] moveCost) {
		int row = grid.length;
		int col = grid[0].length;
		int[] res = new int[col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int value = Integer.MAX_VALUE;
				for (int k = 0; k < col; k++) {
					value = Math.min(value, moveCost[grid[i][k]][j]);
				}
				res[j] += value;
				System.out.println(Arrays.toString(res));
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < col; i++) {
			min = Math.min(min, res[i]);
		}
		return min;
	}
}
