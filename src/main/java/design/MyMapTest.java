package design;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMapTest {

    public static void main(String[] args) {
        MyMap map = new MyMap(new TreeMap());
        map.put("a",1);
        map.put("b",1);
        map.put("c",1);

        Map m = new HashMap();
        m.put("z",1);
        map.putAll(m);
        map.putIfAbsent("e",100);
        System.out.println(map);

        System.out.println(map.getPutCount());

    }
}
