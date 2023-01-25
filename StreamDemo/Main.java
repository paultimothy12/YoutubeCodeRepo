package com.timothy.StreamDemo;

import com.timothy.MapVsFlatMap.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //CONFIGURATION

        //1.filter()
//        Stream.of(1,2,3,4,5,6,7,8,9).filter(i->i>5).forEach(System.out::println);

        //2.map()
//        Stream.of(1,2,3,4,5,6,7,8,9).map(i->i*i).forEach(System.out::println);

        //PROCESSING

        //1.collect()
//        Set<Integer> integers=
//                Stream.of(1,2,3,4,5,5,6,7,8,9).collect(Collectors.toSet());
//        System.out.println(integers);

//        //2.count()
//        long integerCount=Stream.of(1,2,3,4,5,6,7,8,9).count();
//        System.out.println(integerCount);

        //3.sorted()
        // Ascending
//        Stream.of(1, 2, 10, 4, 5, 68, 17, 8, 9).sorted().forEach(System.out::println);
        // Descending - add a comparator
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);

        //4.min()/max()
//        Integer min = Stream.of(0,1, 2, 3, 4, 5, 6, 7, 8,-20, 9).min((a,b)->a.compareTo(b)).get();
//        System.out.println(min);
//        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Integer::compareTo).get();
//        System.out.println(max);

        //5.forEach()
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(System.out::println);

        //6.toArray()
//        Object[] convertedArray=  Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).toArray();
//        System.out.println(Arrays.toString(convertedArray));

        //7.of()

        //We can convert anything into Stream using .of()
        //Array to Stream
//        String[] name ={"Monica","Jake","Mike"};
//        Stream.of(name).forEach(System.out::println);
        //String to Stream
//        String str = "Hello! How are you?";
//        Stream.of(str).forEach(System.out::println);
        //Collections to Stream
//        List<String> stringList = Arrays.asList("Nick","Colt","Steel");
//        Stream.of(stringList).forEach(System.out::println);
        //Any Value
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(System.out::println);
//        Stream.of("Nick","Colt","Steel").forEach(System.out::println);

        //8.peek() - Used for Debugging
//        List<Integer> collect1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                .sorted((a, b) -> b.compareTo(a))  // 9 8 7 6 5 4 3 2 1
//                .filter(i -> i > 5)     //9 8 7 6
//                .map(i -> i * i)    //81 64 49 36
//                .collect(Collectors.toList());
//        System.out.println(collect1);

        //9.reduce()
//        long totalSum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce((a,b)->a+b).get();
//        System.out.println(totalSum);
//        System.out.println(totalSum/integerCount);

        //10.limit()
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).limit(5).forEach(System.out::println);

        //11.skip()
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(5).forEach(System.out::println);


        //SHORT CIRCUIT OPERATIONS
//        if(c1&&c2){
//
//        }

        //Intermediate Operation
        //1.limit()
//        Stream.of("Nick","Colt","Steel").limit(2).forEach(System.out::println);

        //Terminal Operations
        //1.findFirst()
//        Student obj1 = StudentDatabase.getAllStudents().stream()
//                .filter(student -> student.getName().contains("Tim")).findFirst().get();
//        System.out.println("find First "+obj1);

        //2.findAny()
//        Student obj2= StudentDatabase.getAllStudents().stream()
//                .filter(student -> student.getName().contains("Tim")).findAny().get();
//        System.out.println("find Any "+obj2);
//        Student obj3= StudentDatabase.getAllStudents().parallelStream()
//                .filter(student -> student.getName().contains("Tim")).findAny().get();
//        System.out.println("find Any "+obj3);

        //3.anyMatch()
//        boolean match1= StudentDatabase.getAllStudents().stream().anyMatch(student -> student.getName().contains("Tim"));
//        System.out.println("Any Match "+ match1);
//        boolean match2= StudentDatabase.getAllStudents().stream().anyMatch(student -> student.getName().contains("Johan"));
//        System.out.println("Any Match "+ match2);

        //4.allMatch()
//        boolean match3= StudentDatabase.getAllStudents1().stream().allMatch(student -> student.getName().contains("Tim"));
//        System.out.println("All Match "+match3);
//        boolean match4= StudentDatabase.getAllStudents1().stream().allMatch(student -> student.getName().contains("Tim"));
//        System.out.println("All Match "+match4);

        //5.noMatch()
        boolean match5= StudentDatabase.getAllStudents1().stream().noneMatch(student -> student.getName().contains("Null"));
//        System.out.println("None Match "+match5);
        boolean match6= StudentDatabase.getAllStudents().stream().noneMatch(student -> student.getName().contains("name"));
        System.out.println("None Match "+match6);

    }
}
