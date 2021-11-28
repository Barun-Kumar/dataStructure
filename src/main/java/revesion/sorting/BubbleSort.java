package revesion.sorting;

import com.util.NumbersUtil;

public class BubbleSort {

    public static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-(i+1); j++) {
                if(nums[j]>nums[j+1]){
                    int t= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
            NumbersUtil.printArrayInSingleLine(nums);
        }
    }
    public static void main(String[] args) {
        int [] nums=NumbersUtil.generateRandomArray(1,10,5);
        NumbersUtil.printArrayInSingleLine(nums);
        bubbleSort(nums);
        //NumbersUtil.printArrayInSingleLine(nums);
    }
}
