package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalFlatMapExample {

    //filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    //flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() > 3.5) //Optional<Student<Optional<Bike>>
                .flatMap(Student::getBike) //returns -> Optional<Bike>
                .map(Bike::getName);

        name.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        //optionalFilter();
        //optionalMap();
        optionalFlatMap();
    }
}
