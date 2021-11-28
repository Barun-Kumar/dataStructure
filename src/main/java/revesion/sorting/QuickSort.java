package revesion.sorting;

import com.util.NumbersUtil;

public class QuickSort {
    public static void main(String[] args) {
        int [] nums= NumbersUtil.generateRandomArray(1,100,100);
        NumbersUtil.printArrayInSingleLine(nums);
        quickSort(nums,0,nums.length-1);
        NumbersUtil.printArrayInSingleLine(nums);
    }

    private static void quickSort(int[] nums, int start, int end) {
        if(start<end){
            int pindex= partition(nums,start,end);
            quickSort(nums,start, pindex-1);
            quickSort(nums,pindex+1,end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot =nums[end];
        int pindex= start;
        for (int i = start; i < nums.length-1; i++) {
            if(nums[i]<pivot){
                int t= nums[i];
                nums[i]= nums[pindex];
                nums[pindex]=t;
                pindex++;
            }
        }

        int t= nums[end];
        nums[end]= nums[pindex];
        nums[pindex]=t;
        return pindex;
    }
}
