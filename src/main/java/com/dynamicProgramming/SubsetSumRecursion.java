package com.dynamicProgramming;

public class SubsetSumRecursion {
    public static void main(String[] args) {
        int[] arr= {2,3,5,7};
        int n=arr.length;
        int sum=11;
        
        boolean r=isSubsetExist(arr,sum,n);
        System.out.println(r);
        
    }

    private static boolean isSubsetExist(int[] arr, int sum, int n) {
        if(sum==0)
            return true;
        if(n==0)
            return false;
        if(arr[n-1]<=sum) {
            return isSubsetExist(arr, sum - arr[n - 1], n - 1) || isSubsetExist(arr, sum, n - 1);
        }else{
            return isSubsetExist(arr, sum, n - 1);
        }
    }
}
