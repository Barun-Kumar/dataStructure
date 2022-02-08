package java8.questions;

import java.util.*;

public class RemoveFromList {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);

        //Iterator Universal, forward , remove is allowed but does not support addition.
    /*    Iterator itr = list.iterator();
        while(itr.hasNext()){
            Integer e= (Integer) itr.next();
            if(e%2!=0){
                itr.remove();

            }
        }
        System.out.println(list);*/

        ListIterator<Integer> litr= list.listIterator();
        while(litr.hasNext()){
            litr.add(100);
            Integer i = litr.next();
        }
        System.out.println(list);


    }


}
