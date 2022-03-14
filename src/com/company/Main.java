package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int input;
        int pos=0;
        int neg=0;
        int zeros=0;
        do{
            int n = sc.nextInt();
            if(n>0) pos+=1;
            else if (n<0) neg+=1;
            else zeros+=1;
            System.out.println("Do you want to continue?? Press 1 for Yes, 0 for No");
            input = sc.nextInt();
        }while(input==1);

        System.out.println("Total Positive Numbers = "+pos);
        System.out.println("Total Negative Numbers = "+neg);
        System.out.println("Total Zeros = "+zeros);
    }
}
