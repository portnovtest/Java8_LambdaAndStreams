package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {


    public static void main(String[] args) {
        int value = 4; // local variable

        Consumer<Integer> c1 = (i)-> {
            System.out.println(value + i);
        };

        c1.accept(4);
    }
}
