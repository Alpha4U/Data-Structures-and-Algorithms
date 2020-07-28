package com.shubhamawasthi.algo.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,84,23,12,7,23,6,2,-56};
        int unsortedArrLength = arr.length-1;
        for (int i = unsortedArrLength; i > 0 ; i--) {
            for (int j = 0; j < unsortedArrLength; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int []intArr, int i, int j) {
        if(i == j) return;
        intArr[i] = intArr[i]+intArr[j];
        intArr[j] = intArr[i]-intArr[j];
        intArr[i] = intArr[i]-intArr[j];
    }

}