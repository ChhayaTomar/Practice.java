package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //time complexity=O(nlogn)

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString( mergeSort(arr,0,n-1)));
       int[] newArr = mergeSort(arr,0,n-1);
        printArray(newArr);

//
//        for(int i=0;i<finalArr.length;i++){
//            System.out.print(finalArr[i] + " ");
//        }
    }


    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr,int start, int end){
        if(start==end){
            int[] res=new int[1];
            res[0]=arr[start];
            return res;
        }
        int mid=(start+end)/2;
        int[] lArr=mergeSort(arr,start,mid);
        int[] rArr=mergeSort(arr,mid+1,end);

        return mergeTwoSortedArray(lArr,rArr);

    }

    public static int[] mergeTwoSortedArray(int[] lArr, int[] rArr){
        int[] finalArr=new int[lArr.length+rArr.length];
        int i=0,j=0;

        for(int k=0;k<finalArr.length;k++){
            if(i!=lArr.length && j!=rArr.length){
                finalArr[k]=lArr[i]<rArr[j] ? lArr[i++] : rArr[j++];
            }else if(i<lArr.length){
                finalArr[k]=lArr[i++];
            }else{
                finalArr[k]=rArr[j++];
            }
        }
        return finalArr;
    }
}
