package com.learnJava.defaults;

public interface Interface2 extends Interface1{

    default void methodA(){
        System.out.println("Inside Method A " + Interface2.class);
    }

    default void methodB(){
        System.out.println("Inside Method B");
    }
}
