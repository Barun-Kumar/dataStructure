package com.array;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr ={ 1, 2, 3, 4, 5,6, 7, 8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20};
        int n = arr.length;
        int d=5;
        Arrays.stream(arr).forEach(num-> System.out.print(num+" "));
        rotateArr(arr,d,n);
        System.out.println();
        Arrays.stream(arr).forEach(num-> System.out.print(num+" "));
    }
    static void rotateArr(int[] arr, int d, int n)
    {
        if(arr.length==0){
            return;
        }

        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<d;i++){
            temp.add(arr[i]);
        }
        int j=0;
        for(int i=d;i<n;i++){
            arr[j]=arr[i];
            j++;
        }

        for(int i=0;i<temp.size();i++){
            arr[j]=temp.get(i);
            j++;
        }
    }


}
