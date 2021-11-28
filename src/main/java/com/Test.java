package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void swap(List<Integer> nums, int i, int j){
        int temp = nums.get(i);
        nums.set(nums.indexOf(temp),nums.get(j));
        //  System.out.println(nums);
        nums.set(j,temp);
        // System.out.println(nums);
    }
    public static void main(String[] args) {
        int input =3;
        List<Integer> nums = new ArrayList<>();
        for(int i=1;i<=input;i++){
            nums.add(i);
        }
        System.out.println("List of number whose permutation to be generated");
        System.out.println(nums);
        System.out.println("==================");
        Set<List<Integer>> ans= new HashSet<>();
        for(int i=0;i< nums.size()-1;i++){
            swap(nums,i,i+1);
            System.out.println(nums);
            ans.add(nums);
        }

        System.out.println("=======================");

        System.out.println(ans);
    }

}
