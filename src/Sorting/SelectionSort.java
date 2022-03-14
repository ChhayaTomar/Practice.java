package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Time Complexity = O(n^2)

        for(int i=0;i<n;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            //Swapping
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
