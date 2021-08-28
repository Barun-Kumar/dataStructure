package com.array;

public class Test {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5};
        int r=MissingNumber(arr,arr.length+1);
        System.out.println(r);
    }

    static int MissingNumber(int[] array, int n) {
        int sum=0;
        int actual=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            actual=actual+(i+1);
        }
        System.out.println(sum);
        actual=actual+array[array.length-1];
        return actual - sum;

    }
}
