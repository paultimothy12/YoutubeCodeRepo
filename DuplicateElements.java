package com.timothy.CollectionsFrequency;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {
    public static void main(String[] args) {
        //Find Duplicate Elements in a Collection, Array/String.

        //Collections
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i <=5; i++) {
            intList.add(i);
        }
        intList.add(1);
        intList.add(5);
        System.out.println(intList);
        for (Integer o:intList) {
            if(Collections.frequency(intList,o)>1)
                System.out.println(o);
        }

//        Solution - return set (Set doesn't allow duplicates)
        Set<Integer> integerSet= new HashSet<>();
        for (Integer o:intList) {
            if(Collections.frequency(intList,o)>1)
                integerSet.add(o);
        }

        System.out.println(integerSet);



        //Using Stream
        Set<Integer> duplicates = intList.stream().filter(integer -> Collections.frequency(intList,integer) > 1).collect(Collectors.toSet());

        System.out.println(duplicates);


        //String

        String str="Fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
//        Stream.of(str).forEach(System.out::println);
        String[] convertedStringArray=str.split(" ");
        Stream.of(convertedStringArray).peek(System.out::println).filter(value-> Collections.frequency(List.of(convertedStringArray),value)>1)
                        .forEach(System.out::println);


        Map<String,Integer> hm= new HashMap<>();
        for(String inValue: convertedStringArray){
            if(Collections.frequency(List.of(convertedStringArray),inValue)>1)
            hm.put(inValue,Collections.frequency(List.of(convertedStringArray),inValue));
        }

        System.out.println(hm);

    }
}
