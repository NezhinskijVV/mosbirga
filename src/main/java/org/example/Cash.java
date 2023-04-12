package org.example;

public interface Cash<K,V> {
    void put(K key, V value);
    V get(K key);
}