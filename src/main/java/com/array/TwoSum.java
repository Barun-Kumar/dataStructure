package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr= Arrays.copyOf(nums,nums.length);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(arr); // log(n);
        int[] ans= new int[2];
        for(int i=0;i<arr.length;i++){
            int newTarget= target-arr[i];
            int number=TwoSum.searchTarget(i,arr,newTarget);
            if(number!=Integer.MAX_VALUE) {
                ans[0] = map.get(arr[i]);
                ans[1] = map.get(number);
                return ans;
            }
        }
        return ans;
    }

    public static int searchTarget(int dontInclude, int[] nums, int target){
        int end=nums.length-1;
        int start=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target && mid!=dontInclude){
                return nums[mid];
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] nums ={3,3};
        int target=6;
        int[] res=twoSum(nums,target);
        for (int i = 0; i < res.length; i++) {
            System.out.println("RES "+res[i]);
        }
    }
}
