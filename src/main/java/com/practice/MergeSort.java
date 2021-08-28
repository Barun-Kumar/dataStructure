package com.practice;

import com.util.NumbersUtil;

public class MergeSort {
    public static void main(String[] args) {
        int min=0;
        int max=10;
        int arraySize=100000000;
        int [] nums= NumbersUtil.generateRandomArray(min,max,arraySize);

       // NumbersUtil.printArrayInSingleLine(nums);
        System.out.println();
        long startTime =System.currentTimeMillis();
        mergeSort(nums);
        long endTime=System.currentTimeMillis();
        //NumbersUtil.printArrayInSingleLine(nums);
        System.out.println("\nTime taken to sort the array :"+(endTime-startTime)/1000);

    }

    public static void mergeSort(int[] nums){
        if(nums.length==1)
            return;
        int mid = nums.length/2;
        int[] f = new int[mid];
        for (int i=0;i<mid;i++){
            f[i]=nums[i];
        }
        int[] s = new int[nums.length-mid];
        for (int i=mid;i<nums.length;i++){
            s[i-mid]=nums[i];
        }
        
        mergeSort(f);
        mergeSort(s);
        merge(f,s,nums);

    }
    
    public static void merge(int[]f,int[]s,int[]nums){
        int i = 0,j = 0,k=0;
        while (i<f.length && j<s.length){
            if(f[i]<s[j]){
                nums[k]=f[i];
                k++;
                i++;
            }else{
                nums[k]=s[j];
                k++;
                j++;
            }
        }
        while(i<f.length){
            nums[k]=f[i];
            k++;
            i++;
        }
        while (j<s.length){
            nums[k]=s[j];
            k++;
            j++;
        }
    }

}
