package com.company;

import java.sql.SQLOutput;
import java.util.*;


public class Anagram {
    public static void main(String[] args) {
        String str1="manan";
        String str2="naman";

    char[] charArray1=str1.toCharArray();
    Arrays.sort(charArray1);
    char[] charArray2=str2.toCharArray();
    Arrays.sort(charArray2);

    str1= new String(charArray1);
    str2=new String(charArray2);

    if(str1.equals(str2)) System.out.println("The given strings are anagram !");
    else System.out.println("The given strings are not anagram !");

    }
}
