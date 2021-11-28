package com.sorting;

import com.util.NumbersUtil;

public class SelectionSort {

    public static void main(String[] args) {
        int min=0;
        int max=10;
        int arraySize=10;
        int [] nums= NumbersUtil.generateRandomArray(min,max,arraySize);
        long startTime=System.currentTimeMillis();
        sortArray(nums);
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000 +" Sec");
        NumbersUtil.printArrayInSingleLine(nums);

    }
    public static int[] sortArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }

        for(int i=0;i<nums.length-1;i++){
            int imin = i;

            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[imin]){
                    imin=j;
                }
            }
            int t= nums[i];
            nums[i]=nums[imin];
            nums[imin]=t;

        }
        return nums;

    }
}
