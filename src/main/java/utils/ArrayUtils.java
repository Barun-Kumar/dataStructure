package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayUtils {

    public static void printArray(int[] arr){
        if(arr.length==0){
            System.out.println("Array is empty");
        }else{
            for(Integer i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public static int[] generateRandomArray(int size, int minBound, int maxBound){
        int[] nums= new int[size];
        Random r = new Random();
        for(int i=0;i<nums.length;i++){
            nums[i]=r.nextInt(maxBound-minBound)+minBound;
        }
        return nums;
    }


    public static  List<Integer>  generateRandomList(int size, int minBound, int maxBound){
        List<Integer> nums= new ArrayList<>(size);
        Random r = new Random();
        for(int i=0;i<size;i++){
            nums.add(r.nextInt(maxBound-minBound)+minBound);
        }
        return nums;
    }
}
