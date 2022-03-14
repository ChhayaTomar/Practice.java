package com.company.practice;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 9;
        int[] arr = {1, 3, 5, 15, 20, 23};
//        for (int i = 0; i <n; i++) {
//            arr[i]=sc.nextInt();
//        }
        int l = 0, r = 6;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (l > r) {
            System.out.println(-1);
        }
    }
}
