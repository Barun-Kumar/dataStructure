package com.util;

import java.util.Random;

public class NumbersUtil {

    public static int[] generateRandomArray(int min, int max,int l){
        int[] nums = new int[l];
        for(int i=0;i<l;i++){
            Random r = new Random();
            int n=r.nextInt(((max-min)+1)+min);
            nums[i]=n;
        }

        return nums;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
