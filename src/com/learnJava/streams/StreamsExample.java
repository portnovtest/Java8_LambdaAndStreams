package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        // student name and their activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
                .peek((System.out::println))
                .filter(studentPredicate) // Stream<Students>
                .peek((student -> {
                    System.out.println("after 1st filter " + student);
                }))
                .filter(studentGpaPredicate) // Stream<Students>
                .peek((student -> {
                    System.out.println("after 2nd filter " + student);
                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities)); // <Map>

        System.out.println(studentMap);
    }
}
