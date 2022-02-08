package utils;

import java.util.List;

public class ListUtil<T> {

    public static ListUtil getInstance(){
        return new ListUtil();
    }

    public void printList(List<T> list){
        for (T t: list){
            System.out.println(t);
        }
    }
}
