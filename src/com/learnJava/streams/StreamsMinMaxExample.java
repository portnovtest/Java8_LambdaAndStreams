package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable holds the max value for each element in the iteration
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable holds the max value for each element in the iteration
                .reduce((x, y) -> x < y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable holds the max value for each element in the iteration
                .reduce((x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        //List<Integer> integerList = new ArrayList<>();

        Optional<Integer> minValue = findMinValue(integerList);
        System.out.println("minValue : " + minValue);

        if (minValue.isPresent()) {
            System.out.println(minValue.get());
        } else {
            System.out.println("No min value found");
        }

//        int maxValue = findMaxValue(integerList);
//        System.out.println(" max value is : " + maxValue);
//
//        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
//        if (maxValueOptional.isPresent()){
//            System.out.println(" max value using optional : " + maxValueOptional.get());
//        } else {
//            System.out.println("No max value found");
//        }
    }
}
