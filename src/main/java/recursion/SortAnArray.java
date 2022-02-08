package recursion;

import utils.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class SortAnArray {


    public static void main(String[] args) {
        List<Integer> list =  ArrayUtils.generateRandomList(10,1,20);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(List<Integer> list){
        if(list.size()==1){
            return;
        }
        int temp= list.remove(list.size()-1);
        sort(list);
        insert(list,temp);
    }

    public static void insert(List<Integer> list, int val){
        if(list.isEmpty()|| list.get(list.size()-1)<=val){
            list.add(val);
            return;
        }
        int temp = list.remove(list.size()-1);
        insert(list,val);
        list.add(temp);
    }
}
