package com.util;

import java.util.ArrayList;
import java.util.List;
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
    public static List<Integer> generateRandomList(int min, int max, int l){
           List<Integer> nums = new ArrayList<Integer>();
            for(int i=0;i<l;i++){
                Random r = new Random();
                int n=r.nextInt(((max-min)+1)+min);
                nums.add(n);
            }
            return nums;
    }

    public static void printArray(int[] nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void printArrayInSingleLine(int[] nums){
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
