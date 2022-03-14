package com.company.powerProgrammer;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        int result=removeElements(arr);
        System.out.println(result);
    }
    public static int removeElements(int[] arr){
        boolean[] boolArr=new boolean[arr.length];
        Arrays.fill(boolArr,false);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                boolArr[i]=true;
            }
        }
        int count=0;
        for(int i=0;i< boolArr.length;i++){
            if(boolArr[i]==true) count++;
        }
        if(count==boolArr.length || count==0) return -1;
        else return count;
    }
}
