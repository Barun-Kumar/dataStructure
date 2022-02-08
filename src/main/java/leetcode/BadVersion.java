package leetcode;

import java.util.Arrays;

public class BadVersion {
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;

        while(start<=end){
            mid =(int)start+Math.floorDiv((end-start),2);
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        if(target<nums[mid]){
            if(mid-1==-1){
                return 0;
            }else if(mid==nums.length-1){
                return mid;
            }else{
                return mid-1;
            }

        }else {
            return mid+1;
        }

    }
    public static void main(String[] args) {
        int[] nums ={1,3};
        Arrays.sort(nums);
       for(int n: nums){
           System.out.println(n);
       }
        int target=2;
        int ans =searchInsert(nums,target);
        System.out.println(ans);
    }
}
