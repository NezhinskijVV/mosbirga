package org.example;


//кеш
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Cash<String, Object> cash = new CashImpl<>();
        Object value = new Object();
        cash.put("oleg", value);
        System.out.println("value = " + value);
        System.out.println(cash.get("oleg"));

    }
}