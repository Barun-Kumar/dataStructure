package com.sorting;

import com.util.NumbersUtil;

public class MergeSort {
    public static void main(String[] args) {
        int min=0;
        int max=10;
        int arraySize=10;
        int [] first= NumbersUtil.generateRandomArray(min,max,arraySize);
        System.out.println("First array :");
        NumbersUtil.printArrayInSingleLine(first);
        mergeSort(first);
        System.out.println("\nSorted First array :");
        NumbersUtil.printArrayInSingleLine(first);

    }

    public static int [] mergeSort(int[] nums){
        int n = nums.length;
        //base condition
        if(n<2){
            return nums;
        }
        int mid =n/2;
        int[] left =new int[mid];
        int[] right = new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]=nums[i];
        }
        for(int j=0;j<(n-mid);j++){
            right[j]=nums[j+mid];
        }
        mergeSort(left);
        mergeSort(right);
        mergeSortedArray(left,right,nums);
    return nums;
    }


    /**
     * Merge two sorted array
     * @param l left array
     * @param r right array
     * @return new merged array
     */
    public static int[] mergeSortedArray(int[] l, int[] r, int[] nums){
        int ll = l.length;
        int rl=r.length;
        int i=0,j=0,k=0;
        while(i<ll && j<rl){
            if(l[i]<=r[j]){
                nums[k]=l[i];
                i++;
                k++;
            }else{
                nums[k]=r[j];
                k++;
                j++;
            }
        }
        while(i<ll){
            nums[k]=l[i];
            k++;
            i++;
        }
        while(j<rl){
            nums[k]=r[j];
            k++;
            j++;
        }

    return nums;
    }


}
