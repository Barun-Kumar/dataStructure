package com.array;

import com.util.NumbersUtil;

public class RotateArrayByK {

    public static void main(String[] args) {
        int[] arr ={ 1, 2, 3, 4, 5,6, 7};
        int k=3;
        rotate(arr,k);
        NumbersUtil.printArrayInSingleLine(arr);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int t=nums[start];
            nums[start]=nums[end];
            nums[end]=t;
            start++;end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }

        k=k%nums.length;
        int start=nums.length-k;
        int end=nums.length-1;
        reverse(nums,start,end);
        NumbersUtil.printArrayInSingleLine(nums);
        start=0; end=k;
        reverse(nums,start,end);
        NumbersUtil.printArrayInSingleLine(nums);
        start=0; end =nums.length-1;
        reverse(nums,start,end);

    }
}
