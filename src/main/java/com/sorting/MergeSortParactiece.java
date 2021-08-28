package com.sorting;

import com.util.NumbersUtil;

public class MergeSortParactiece {

    public static void main(String[] args) {
        int min=0;
        int max=10;
        int arraySize=100000;
        int [] first= NumbersUtil.generateRandomArray(min,max,arraySize);
        System.out.println("First array :");
        NumbersUtil.printArrayInSingleLine(first);
        mergeSort(first);
        System.out.println("\nSorted First array :");
        NumbersUtil.printArrayInSingleLine(first);
    }

    public static void mergeSort(int[] arr){
        if(arr.length==1){
            return;
        }
        int mid= arr.length/2;
        int[] l = new int[mid];
        int[] r= new int[arr.length-mid];
        for(int i=0;i<mid;i++){
            l[i]=arr[i];
        }
        for(int j=0;j< arr.length-mid;j++){
            r[j]=arr[j+mid];
        }
        mergeSort(l);
        mergeSort(r);
        mergeTwoSortedArray(l,r,arr);

    }

    public static void mergeTwoSortedArray(int[] l, int[] r, int[] arr){
        int ls= l.length;
        int rs = r.length;
        int i=0,j=0,k=0;
        while(i<ls && j<rs){
            if(l[i]<r[j]){
                arr[k]=l[i];
                i++;
            }else{
                arr[k]=r[j];
                j++;
            }
            k++;

        }

        while(i<ls){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(j<rs){
            arr[k]=r[j];
            k++;
            j++;
        }
    }
}
