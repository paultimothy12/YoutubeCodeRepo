package com.timothy.CollectorsGroupingBy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDatabase {
    public static List<Student> getAllStudents(){
        return Stream.of(
                new Student(20,"Ash","Infosys"),
                new Student(21,"Ben","Amazon"),
                new Student(20,"Ash","Microsoft"),
                new Student(23,"Tim","IBM"),
                new Student(21,"Ben","Infosys")
        ).collect(Collectors.toList());
    }
}
