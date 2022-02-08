package java8.questions;

import java.util.*;

public class EnumerationTest {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=1;i<=10;i++){
            v.add(i);
        }
        System.out.println(v);

        Enumeration<Integer> e = v.elements();
        Iterator<Integer> i = v.iterator();
        ListIterator<Integer>li =v.listIterator();

        while(e.hasMoreElements()){
            Integer n=e.nextElement();
            System.out.println(n);

        }
    }
}
