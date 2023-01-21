package com.timothy.MapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        //Get the name of the students - Map - Data Transformation
        // One I/p, One O/p
//        List<Integer> studentsName=
//                StudentDatabase.getAllStudents().stream()
//                .map(student -> student.getRollNo())
//                .collect(Collectors.toList());
//        System.out.println(studentsName);

        //Get the Parents Name of the students - FlatMap - Data Transformation with flattening
        // One I/p, Multiple O/p

//        List<List<String>> parentsName = StudentDatabase.getAllStudents().stream()
//                .map(student -> student.getParentsName())
//                .collect(Collectors.toList());
//        System.out.println(parentsName);
//
        List<String> parentsNameFlattened = StudentDatabase.getAllStudents().stream()
                .flatMap(student -> student.getParentsName().stream())
                .collect(Collectors.toList());
        System.out.println(parentsNameFlattened);
    }
}
