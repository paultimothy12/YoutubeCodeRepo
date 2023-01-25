package com.timothy.StreamDemo;

import com.timothy.MapVsFlatMap.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDatabase {
    public static List<Student> getAllStudents(){

        return Stream.of(
                new Student(1,"Johan", Arrays.asList("Jard","Mary")),
                new Student(2,"Tim",Arrays.asList("Pablo","Jane")),
                new Student(3,"Stark",Arrays.asList("Nick","Anya")),
                new Student(4,"Tim",Arrays.asList("Pablo4","Jane4")),
                new Student(5,"Tim",Arrays.asList("Pablo5","Jane5")),
                new Student(6,"Tim",Arrays.asList("Pablo6","Jane6"))
        ).collect(Collectors.toList());
    }

    public static List<Student> getAllStudents1(){

        return Stream.of(
                new Student(1,"Tim", Arrays.asList("Jard","Mary")),
                new Student(2,"Tim",Arrays.asList("Pablo","Jane")),
                new Student(3,"Tim",Arrays.asList("Nick","Anya")),
                new Student(4,"Tim",Arrays.asList("Pablo4","Jane4")),
                new Student(5,"Tim",Arrays.asList("Pablo5","Jane5")),
                new Student(6,"Tim",Arrays.asList("Pablo6","Jane6"))

        ).collect(Collectors.toList());
    }
}
