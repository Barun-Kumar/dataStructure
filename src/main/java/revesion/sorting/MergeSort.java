package revesion.sorting;

import com.util.NumbersUtil;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] nums){
        if(nums.length==1){
            return;
        }
        int l=nums.length;
        int mid= l/2;
        int []f = new int[mid];
        int []s = new int[l-mid];
        for (int i = 0; i < f.length; i++) {
            f[i]=nums[i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i]=nums[(mid+i)];
        }
        mergeSort(f);
        mergeSort(s);
        merge(f,s,nums);
    }

    public static void merge(int[] f, int []s, int t[]){
        int i=0,j=0,k=0;
        while (i<f.length && j<s.length){
            if(f[i]<s[j]){
                t[k]=f[i];
                k++;
                i++;
            }else {
                t[k]=s[j];
                k++;
                j++;
            }
        }
        while(i<f.length){
            t[k]=f[i];
            k++;
            i++;
        }
        while(j<s.length){
            t[k]=s[j];
            k++;
            j++;
        }
        System.out.println("Third Array");
        NumbersUtil.printArrayInSingleLine(t);

    }
    public static void main(String[] args) {
//        int[] f= NumbersUtil.generateRandomArray(0,5, 5);
//        Arrays.sort(f);
//        System.out.println("First Array");
//        NumbersUtil.printArrayInSingleLine(f);
//        int[] s= NumbersUtil.generateRandomArray(10,15, 5);
//        Arrays.sort(s);
//        System.out.println("Second Array");
//        NumbersUtil.printArrayInSingleLine(s);
//        int[] t = new int[f.length+s.length];
//        merge(f,s,t);

        int[] nums= NumbersUtil.generateRandomArray(0,10, 10);
        System.out.println("Before Sorting");
        NumbersUtil.printArrayInSingleLine(nums);
        mergeSort(nums);
        System.out.println("After Sorting");
        NumbersUtil.printArrayInSingleLine(nums);

    }
}
