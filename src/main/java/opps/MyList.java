package opps;

import java.util.HashMap;
import java.util.Map;

public interface MyList {
    public int count = 0;
    default public int getCount() {
        return count;
    }
    //Can not reinitialize the member variable because they are final
    // it can not have constructor
}


abstract class  CountableMap<K,V> implements Map<K,V> {
      private Map<K,V> map;
      private long putCount;
      private long putAllCount;
      private long putIfAbsentCount;

      public CountableMap(Map map){
          this.map=map;
      }

      @Override
      public V put(K key,V value){
            V v= map.put(key,value);
            if(null!=v){
                putCount++;
            }
            return v;
      }

      @Override
      public V remove(Object obj){
         return map.remove(obj);
      }
}

