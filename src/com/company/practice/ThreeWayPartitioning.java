package com.company.practice;

import java.util.Scanner;
import java.util.*;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int[] arr=new int[n];

        ArrayList<Integer> arrList=new ArrayList<Integer>();
        for (int i = 0; i <n; i++) {
            //arr[i]=sc.nextInt();
            arrList.add(sc.nextInt());
        }
        int lowVal=sc.nextInt();
        int highVal=sc.nextInt();
//        System.out.println(arrList);

        arrList=partition(arrList,lowVal,highVal);
        System.out.println(arrList);
    }

    public static ArrayList<Integer> partition(ArrayList<Integer> arrList,int lowVal,int highVal) {
        int low = 0;
        int mid = 0;
        int high = arrList.size() - 1;
        while (mid <= high) {
            int value;
            if (arrList.get(mid) < lowVal) {
                value = 0;
            } else if (arrList.get(mid) >= lowVal && arrList.get(mid) <= highVal) {
                value = 1;
            } else {
                value = 2;
            }
            switch (value) {
                case (0):
                    Collections.swap(arrList, mid, low);
                    mid++;
                    low++;
                    break;
                case (1):
                    mid++;
                    break;
                case (2):
                    Collections.swap(arrList, mid, high);
                    high--;
                    break;
            }
        }
        return arrList;
    }
}
