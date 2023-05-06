package com.bingoabin.sort;

import java.util.Arrays;

/**
 * @author bingoabin
 * @date 2022/5/13 15:26
 */
public class SortTest {
	public static void main(String[] args) {
		int[] arr = {9, 7, 5, 3, 2, 6, 7, 4, 1, 0};
		SortTest sortTest = new SortTest();
		sortTest.quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void quickSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	public void sort(int[] arr, int left, int right) {
		if(left >= right) return;
		int temp = arr[left];
		int i = left;
		int j = right;
		while (i < j) {
			while (i < j && arr[j] > temp) j--;
			while (i < j && arr[i] <= temp) i++;
			if (i < j) {
				swap(arr, i, j);
			}
		}
		arr[left] = arr[i];
		arr[i] = temp;
		sort(arr, left, i - 1);
		sort(arr, i + 1, right);
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
