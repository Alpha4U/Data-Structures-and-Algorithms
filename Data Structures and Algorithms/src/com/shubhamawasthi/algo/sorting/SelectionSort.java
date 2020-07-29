package com.shubhamawasthi.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 84, 23, 12, 7, 23, 6, 2, -56 };
		int lastUnsortedIndex = arr.length - 1;

		for (int i = lastUnsortedIndex; i > 0; i--) {
			int largest = 0;
			for (int j = 1; j <= i; j++) {
				if (arr[j] > arr[largest]) {
					largest = j;
				}
			}
			swap(arr, largest, i);
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int[] intArr, int i, int j) {
		if (i == j)
			return;
		intArr[i] = intArr[i] + intArr[j];
		intArr[j] = intArr[i] - intArr[j];
		intArr[i] = intArr[i] - intArr[j];
	}

}
