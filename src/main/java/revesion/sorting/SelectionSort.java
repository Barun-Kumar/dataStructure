package revesion.sorting;

import com.util.NumbersUtil;

public class SelectionSort {
    public static void selectionSort(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            int min =i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int t=nums[i];
            nums[i]=nums[min];
            nums[min]=t;
            NumbersUtil.printArrayInSingleLine(nums);
        }
    }
    public static void main(String[] args) {
        int [] nums=NumbersUtil.generateRandomArray(1,10,5);
        System.out.println("Before selection sort");
        NumbersUtil.printArrayInSingleLine(nums);
        System.out.println("After selection sort");
        selectionSort(nums);
        System.out.println("Output");
        NumbersUtil.printArrayInSingleLine(nums);
    }
}
