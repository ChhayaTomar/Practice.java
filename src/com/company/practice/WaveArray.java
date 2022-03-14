package com.company.practice;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i+=2){
            swap(arr,i,i+1);
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+ " ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
