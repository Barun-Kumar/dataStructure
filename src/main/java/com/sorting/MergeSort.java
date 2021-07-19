package com.sorting;

import com.util.NumbersUtil;

public class MergeSort {
    public static void main(String[] args) {
        int min=0;
        int max=5;
        int arraySize=5;
        int [] first= NumbersUtil.generateRandomArray(min,max,arraySize);
        System.out.println("First array :");
        NumbersUtil.printArrayInSingleLine(first);
        BubbleSort.sortArray(first);
        System.out.println("\nSorted First array :");
        NumbersUtil.printArrayInSingleLine(first);
         min=6;
         max=10;
         arraySize=5;
        int [] second= NumbersUtil.generateRandomArray(min,max,arraySize);
        System.out.println("\nSecond array :");
        NumbersUtil.printArrayInSingleLine(second);
        BubbleSort.sortArray(second);
        System.out.println("\nSecond sorted array :");
        NumbersUtil.printArrayInSingleLine(second);
        long startTime=System.currentTimeMillis();

        int[]nums = mergeSortedArray(first,second);
        long endTime=System.currentTimeMillis();
        System.out.println("\n"+(endTime-startTime)/1000 +" Sec");
        System.out.println("\n Final merged array");
        NumbersUtil.printArrayInSingleLine(nums);
    }

    /**
     * Merge two sorted array
     * @param l left array
     * @param r right array
     * @return new merged array
     */
    public static int[] mergeSortedArray(int[] l, int[] r){
        int ll = l.length;
        int rl=r.length;
        int[] nums = new int[ll+rl];
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
