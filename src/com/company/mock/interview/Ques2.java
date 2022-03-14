package com.company.mock.interview;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int n=arr.length;
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
          int prod=arr[i];
//          if(arr[i]==0)
            for (int j = i+1; j <n; j++) {
                result=Math.max(result,prod);
                prod*=arr[j];
            }
            result=Math.max(result,prod);
        }
        System.out.println(result);
    }
}
