package com.company.practice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Mockques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int[] arr=new int[n];
        ArrayList<Integer> pos=new ArrayList<Integer>();
        ArrayList<Integer> neg=new ArrayList<Integer>();
        int i=0,j=0;

        for(int k=0;k<n;k++){
            int a =sc.nextInt();
            if (a<0){
                neg.add(a);
            }
            else{
                pos.add(a);
            }
        }
        neg.addAll(pos);
        System.out.println(neg);
    }
}
