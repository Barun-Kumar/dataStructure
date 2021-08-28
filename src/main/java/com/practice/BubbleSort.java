package com.practice;

import com.util.NumbersUtil;

public class BubbleSort {
    public static void main(String[] args) {
        int min=0;
        int max=10;
        int arraySize=200000;
        int [] nums= NumbersUtil.generateRandomArray(min,max,arraySize);

        NumbersUtil.printArrayInSingleLine(nums);
        System.out.println();
        long startTime =System.currentTimeMillis();
        sort(nums);
        long endTime=System.currentTimeMillis();
        NumbersUtil.printArrayInSingleLine(nums);
        System.out.println("Time taken to sort the array :"+(endTime-startTime)/1000);

    }

    public static void sort(int[] nums){
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-(1+i);j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }

        }
    }

}
