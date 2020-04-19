package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<Sting>
                .map((String::toUpperCase)) // Stream<Sting> -> uppercase operation on each input
                .collect(Collectors.toList()); // List<String>

        return studentList;
    }

    public static Set<String> namesSet() {
        Set<String> studentSet = StudentDataBase.getAllStudents().stream()
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<Sting>
                .map((String::toUpperCase)) // Stream<Sting> -> uppercase operation on each input
                .collect(Collectors.toSet()); // Set<String>

        return studentSet;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
