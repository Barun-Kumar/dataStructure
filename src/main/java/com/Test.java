package com;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void swap(List<Integer> nums, int i, int j){
        int temp = nums.get(i);
        nums.set(nums.indexOf(temp),nums.get(j));
        //  System.out.println(nums);
        nums.set(j,temp);
        // System.out.println(nums);
    }


    public static String reverse(String s){
        if(s.length()==1){
            return s;
        }
        char[] arr= s.toCharArray();
        int start=0; int end =arr.length-1;
        while(start<end){
            char t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++
            ;end--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s="This is varun";
        String[] arr= s.split("\\s+"); // O(n)
        for(int i =0; i< arr.length;i++){    // O(n)
                arr[i]=reverse(arr[i]);
        }

        for(int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }


           s= Arrays.stream(arr).collect(Collectors.joining(" "));






    }

}
