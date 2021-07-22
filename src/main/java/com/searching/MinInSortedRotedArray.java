package com.searching;

public class MinInSortedRotedArray {
    public static void main(String[] args) {
        int[] nums= {4,5,6,7,0,1,2};
        int res=findMin(nums);
        System.out.println(res);
    }
    public static int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];

        int n= nums.length;
        int start=0;
        int end=n-1;
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid +n-1)%n;
            if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                return nums[mid];
            }else if(nums[start]<nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(nums[mid]);
        return -1;

    }
}
