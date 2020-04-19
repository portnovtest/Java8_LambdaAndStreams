package com.learnJava.defaults;



import com.learnJava.data.Student;


import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (System.out::println);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList){
        System.out.println("After sort :");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> studentList){
        System.out.println("After sort :");
        Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After comparatorChaining : ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList){
        System.out.println("After sortWithNullValues : ");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //System.out.println(studentList);
        System.out.println("Before sort :");
        studentList.forEach(studentConsumer);
        //sortByName(studentList);
        //sortByGPA(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }


}
