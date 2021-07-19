package com.sorting;

import com.util.NumbersUtil;
//Bubble sort O(n^2)
public class BubbleSort {

    public static void main(String[] args) {
        int min=0;
        int max=50000;
        int arraySize=50000;
        int [] nums= NumbersUtil.generateRandomArray(min,max,arraySize);
        long startTime=System.currentTimeMillis();
        sortArray(nums);
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000 +" Sec");
    }

    public static int[] sortArray(int[] nums) {
        if (nums.length==1)
            return nums;
        for(int k=0;k<nums.length;k++){
            boolean isSorted=false;
            for(int i=0;i<nums.length-k-1;i++){
                if(nums[i]>nums[i+1]){
                    int t=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=t;
                    isSorted=true;
                }

            }
            if(!isSorted)
                return nums;
        }
        return nums;

    }
}
