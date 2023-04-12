package org.example;

import java.util.Arrays;

public class FibonacciMain {

    public static void main(String[] args) {
//        fibonacci(10);

        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }

    }

//    public static void fibonacci(int length){
//        //1 1 2 3 5 8 13 21 34 55
//        int[] array = new int[length];
//
//        array[0] = 1;
//        array[1] = 1;
//
//        for (int i = 2; i < array.length; i++) {
//            array[i] = array[i - 2] + array[i - 1];
//        }
//
//        System.out.println(Arrays.toString(array));
//    }

    public static int fib(int num){
        if ((num == 0) || (num == 1)) return 1;

        return fib(num-1) + fib(num-2);
    }
}