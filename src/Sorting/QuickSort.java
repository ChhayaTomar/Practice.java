package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }

        sort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[],int l, int r){
        if(l>r) return;
        int pi=partitionIndex(arr,l,r);
        sort(arr,l,pi-1);
        sort(arr,pi+1,r);
    }
    public static int partitionIndex(int arr[],int l, int r){
        int pivot=arr[r];
        int i=l,j=l;

        while(i<=r){
            if(arr[i]<=pivot){
                if(i!=j) swap(arr,i,j);
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
