package com.array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class DuplicateElementInArray {

    public static void main(String[] args) {
        int[] arr = {14, 7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4, 11, 15, 17, 6, 1, 13};
        ArrayList l = findDuplicate(arr, arr.length);
        System.out.println(l);
    }

    public static ArrayList<Integer> findDuplicate(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int t= map.get(arr[i]);
                t++;
                map.put(arr[i],t);
            }else{
                map.put(arr[i],1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> keys = map.keySet();
        for(Integer k : keys){
            if(map.get(k)>1){
                list.add(k);
            }
        }
        System.out.println(map);
        if(list.size()>0){
            Collections.sort(list);
            return list;
        }else{
            list.add(-1);
            return list;
        }

    }
}

