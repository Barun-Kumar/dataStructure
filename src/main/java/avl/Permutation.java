package avl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutation {
   public static void swap(List<Integer> nums, int i, int j){
        int temp = nums.get(i);
        nums.set(nums.indexOf(temp),nums.get(j));
     //  System.out.println(nums);
        nums.set(j,temp);
      // System.out.println(nums);
   }
    public static void generatePermutation(List<Integer> nums, int index, List<List<Integer>> ans) {
        if (index == nums.size()-1) {
            ans.add(nums);
            System.out.println(nums);
            return;
        }
        for (int i=index;i< nums.size();i++){
            swap(nums,i,index);
            generatePermutation(nums,index+1,ans);
            swap(nums,i,index);
        }
        return;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int input =3;
        List<Integer> nums = new ArrayList<>();
        for(int i=1;i<=input;i++){
            nums.add(i);
        }
        System.out.println("List of number whose permutation to be generated");
        System.out.println(nums);
        System.out.println("==================");
        List<List<Integer>> ans= new ArrayList<>();
        generatePermutation(nums,0,ans);
        System.out.println("After returning result");
        for(List<Integer> list: ans){
            System.out.println(list);
        }




    }
}
