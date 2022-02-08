package design;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K,V> implements Map<K,V> {
    private Map map;
    public  Integer putCount=0;
    public  Integer putAllCount=0;
    public  Integer putIfAbsentCount=0;

    public  Integer getPutCount() {
        return putCount;
    }

    public  Integer getPutAllCount() {
        return putAllCount;
    }

    public  Integer getPutIfAbsentCount() {
        return putIfAbsentCount;
    }

    public MyMap(Map<K,V> map){
        this.map = map;
    }


    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.map.containsKey(value);
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        this.putCount++;
        return (V) this.map.put(key,value);
    }

    @Override
    public V remove(Object key) {
        return (V) this.map.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
            this.putAllCount++;
            this.map.putAll(m);
    }

    @Override
    public void clear() {
            this.map.clear();
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
