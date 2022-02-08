package java8.questions;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        System.out.println(map);

        Iterator<String> itr= map.keySet().iterator();
        while (itr.hasNext()){
            String key = itr.next();
            System.out.println(key +"-"+map.get(key));
            map.put("Four",4);
        }

        System.out.println(map);
    }
}
