package com.company.powerProgrammer;

import java.util.Scanner;

public class ModuloGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int result=game(s);
        System.out.println(result);

    }

    public static int game(String s){
        String[] arr=s.split("");
        int count=0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]=="?"){

            }
        }
        return arr.length;
    }
}
