package com.timothy.CollectorsGroupingBy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        //Normal List
        List<Student> studentList = StudentDatabase.getAllStudents()
                .stream().collect(Collectors.toList());
        System.out.println(studentList);

        //GroupingBy - 1 Args = (lambdaExpression) By Default, it saves as List -> Map(K,List<>).

        Map<Integer,List<Student>> studentMapAge = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getAge()));
//        System.out.println(studentMapAge);

        Map<String,List<Student>> studentMapName = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getName()));
//        System.out.println(studentMapName);

        //GroupingBy - 2 Args = (lambdaExpression,Collectors.toSet())
        // If we want to change the collection(Default = List), We pass a Collection Type as second argument.

        Map<String, Set<Student>> studentNameSet = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getName(),Collectors.toSet()));
//        System.out.println(studentNameSet);

        //GroupingBy - 3 Args = (lambdaExpression,Sorting,Collectors.toSet())
        // We can apply Sorting(Natural Order) to the collection.

        Map<String, Set<Student>> studentNameSetSorted = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student->student.getName(),TreeMap::new,Collectors.toSet()));
        System.out.println(studentNameSetSorted);
    }
}
