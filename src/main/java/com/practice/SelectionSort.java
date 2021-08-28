package com.practice;

import com.util.NumbersUtil;

import java.awt.font.NumericShaper;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int min=0;
        int max=10;
        int arraySize=10;
        int [] nums= NumbersUtil.generateRandomArray(min,max,arraySize);
        long startTime=System.currentTimeMillis();
        NumbersUtil.printArrayInSingleLine(nums);
        System.out.println();
        sort(nums);
        NumbersUtil.printArrayInSingleLine(nums);
    }

    public static void sort(int[] nums){
        for (int i=0;i<nums.length;i++){
            int iMin=i;
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[j]<nums[iMin]){
                   iMin=j;
                }
            }
           int t=nums[i];
            nums[i]=nums[iMin];
            nums[iMin]=t;
        }
    }

}
