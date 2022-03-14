package com.company.practice;

import java.util.Arrays;
import java.util.Scanner;

public class practiceDsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] result=mergeSort(arr, 0, n - 1);
//        System.out.println(Arrays.toString(result));
//        quickSort(arr,0,n-1);
//        System.out.println(Arrays.toString(arr));
    }


//////Merge Sort

    public static int[] mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            int[] res = new int[1];
            res[0] = arr[start];
            return res;
        }
        int mid = (start + end) / 2;
        int lArr[] = mergeSort(arr, start, mid);
        int rArr[] = mergeSort(arr, mid + 1, end);
        return mergeTwoSortedArray(lArr, rArr);
    }

    public static int[] mergeTwoSortedArray(int[] lArr, int[] rArr) {
        int[] newArr = new int[lArr.length + rArr.length];
        int i = 0, j = 0;
        for (int k = 0; k < newArr.length; k++) {
            if (i != lArr.length && j != rArr.length) newArr[k] = (lArr[i] < rArr[j]) ? lArr[i++] : rArr[j++];
            else if (i < lArr.length) newArr[k] = lArr[i++];
            else newArr[k] = rArr[j++];
        }
        return newArr;
    }

    ///Quick Sort

    public static void quickSort(int[] arr, int start, int end){
        if(start>end) return;
        int pi=partitionIndex(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static int partitionIndex(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start,j=start;
        while(i<=end){
            if(arr[i]<=pivot){
                if(i!=j) swap(arr,i,j);
                j++;
            }
            i++;
        }
        return j-1;
    }


    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
