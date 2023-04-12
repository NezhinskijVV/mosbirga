package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CashImpl<K, V> implements Cash<K, V> {
    private final Map<K, V> map = new ConcurrentHashMap<>();
    @Override
    public synchronized void put(K key, V value) {
        map.put(key, value);
    }
    @Override
    public synchronized V get(K key) {
        return map.get(key);
    }
}