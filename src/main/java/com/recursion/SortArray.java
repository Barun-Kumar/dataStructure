package com.recursion;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class SortArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       // System.out.println(list.size());
       // System.out.println(list.get(0));
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(4);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(List<Integer> list){
        if(list.size()==1)
            return;
        int temp = list.remove(list.size()-1);
        sort(list);
        insert(list,temp);
    }

    private static void insert(List<Integer> list, int temp) {
            if(list.isEmpty()|| list.get(list.size() -1)<=temp) {
                list.add(temp);
                return;
            }
            int v= list.remove(list.size()-1);
            insert(list,temp);
            list.add(v);
    }

}
