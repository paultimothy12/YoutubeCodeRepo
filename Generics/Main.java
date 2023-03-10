package com.timothy.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    public static void anyPrinter(Object printItem){
//        System.out.println(printItem);
//    }

    public static void objectListPrinter(List<Object> list) {
        for (Object obj : list)
            System.out.println(obj + " ");
        System.out.println();
    }

    public static void unboundedPrinter(List<?> list) {
        for (Object obj : list)
            System.out.println(obj + " ");
        System.out.println();
    }




    public static void main(String[] args) {
        //TypeCasting
        List<Integer> rawList = new ArrayList<>();
        rawList.add(1);

        Integer i = rawList.get(0);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hey");

        String str = stringList.get(0);

        //Warnings:
        //1
        List rawList0 = new ArrayList();
        List<Integer> integerList = rawList0;
        integerList.add(1);

        //2
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("1");
        List rawList1 = stringList1;
        rawList1.add(1);

//        System.out.println(rawList1);

        //UnboundedWildCards
//        anyPrinter(1);
//        anyPrinter("Hello");

        List<Object> Objectlist = new ArrayList<>();
        Objectlist.add(1);
        Objectlist.add(1.0f);
        Objectlist.add("hello");

        List<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);

        List<String> StringList = new ArrayList<>();
        StringList.add("Luffy");
        StringList.add("Ichigo");

//        objectListPrinter(Objectlist);
//        objectListPrinter(IntegerList);
//        objectListPrinter(StringList);

        unboundedPrinter(Objectlist);
        unboundedPrinter(IntegerList);
        unboundedPrinter(StringList);

    }
}
