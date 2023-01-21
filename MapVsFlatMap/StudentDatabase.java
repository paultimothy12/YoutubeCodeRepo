package com.timothy.MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDatabase {
    public static List<Student> getAllStudents(){

        return Stream.of(
                new Student(1,"Johan", Arrays.asList("Jard","Mary")),
                new Student(2,"Tim",Arrays.asList("Pablo","Jane")),
                new Student(3,"Stark",Arrays.asList("Nick","Anya"))
        ).collect(Collectors.toList());
    }
}
