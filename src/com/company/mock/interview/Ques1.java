package com.company.mock.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr={1, -1, 3, 2, -7, -5, 11, 6 };
        int n=arr.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        pos.addAll(neg);
        System.out.println(pos);
    }
}
