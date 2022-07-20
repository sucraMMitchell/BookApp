package com.bookapp;

import java.util.*;

class MultiMap<K, V>{
    private Map<K, Collection<V>> map = new HashMap<>();


    public boolean isEmpty(){
        return map.isEmpty();
    }

    public void clear(){
        map.clear();
    }

    public int size(){
        int size = 0;
        for(Collection<V> value: map.values()){
            size += value.size();
        }
        return size;
    }

    public void put(K key, V value1, V value2){
        if(map.get(key) == null){
            map.put(key, new ArrayList<V>());
        }

        map.get(key).add(value1).add(value2);
    }

    /**
     * Return true if mapping for key is found.
     **/
    public Collection<V> get(Object key){
        return map.get(key);
    }

    /**
     * Returns a set view of the keys(ISBN) contained in this multimap.
     **/
    public Set<K> keySet(){
        return map.keySet();
    }

    /**
     * Returns a Collection view of values present in multimap.
     **/
    public Collection<Collection<V>> values(){
        return map.values();
    }

    /**
     * Returns true if specified key has mapping.
     **/
    public boolean containsKey(Object key){
        return map.containsKey(key);
    }

    public Collection<V> remove(Object key){
        return map.remove(key);
    }

    public boolean remove(K key, V value1, V value2){
        if (map.get(key) != null) // key exists
            return map.get(key).remove(value1).remove(value2);

        return false;
    }
}
