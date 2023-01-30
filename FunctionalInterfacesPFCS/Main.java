package com.timothy.FunctionalInterfacesPFCS;

import java.util.Date;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //Predicate
        // returns a "boolean" based on lambda expression
        //Abstract Method -> test(value)
        Predicate<String> predicate = s -> s.length()>3;
//        System.out.println(predicate.test("Hello"));
//        System.out.println(predicate.test("Ok"));

        //Predicate Joining
        Predicate<String> predicate1 = s -> s.length()>5;
        Predicate<String> predicate2 = s -> s.length()<10;
        //Methods:
        //1 - And - Output is true, only if both predicate returns true
//        System.out.println(predicate1.and(predicate2).test("Java-17"));
//        //2 - Or - Output is true, if Any 1 predicate is true
//        System.out.println(predicate1.or(predicate2).test("Java"));
//        //3 - negate - Output gets reversed(true<->false) - Only 1 predicate
//        System.out.println(predicate1.negate().test("Java-17"));




        //Function
        //perform "some operation on i/p and produce o/p"
        //Abstract Method -> apply(value) - Function<ip,op>
        Function<Integer,Integer> function = i-> i*i;
//        System.out.println(function.apply(5));
//        System.out.println(function.apply(10));

        //Function Chaining
        Function<Integer,Integer> add = i-> i+i;
        Function<Integer,Integer> cube = i-> i*i*i;
        //Methods:
        //1 - F1.andThen(F2)
        //performs F1 on Value and stores the Value, now F2 performs on New Value and Returns a New Value
//        System.out.println(add.andThen(cube).apply(5));
//        System.out.println(cube.andThen(add).apply(5));
        //2 - F1.compose(F2)
        //performs F2 on Value and stores the Value, now F1 performs on New Value and Returns a New Value
//        System.out.println(add.compose(cube).apply(5));
//        System.out.println(cube.compose(add).apply(5));



        //Consumer
        //consumes i/p & doesn't return value
        //Abstract Method: accept(value)

        Consumer<Integer> square = i-> System.out.println(i*i);
//        square.accept(6);
//        square.accept(9);

        //Consumer Chaining
        Consumer<Integer> Even = i-> System.out.println(i%2==0);
        Consumer<Integer> doubleValue = i-> System.out.println(2*i);
        //Methods:
//        1. C1.andThen(C2)
//        Even.andThen(doubleValue).accept(6);
//        doubleValue.andThen(Even).accept(9);



        //Supplier
        //No i/p, returns Objects of Supplier Type
        //Abstract Methods: get()

        Supplier<Date> curDate = Date::new;
//        System.out.println(curDate.get());

        //Supplier Chaining ? No I/P -> NO CHAINING




        //Bi-Predicate,Bi-Function,Bi-Consumer
        // 2 Inputs/Arguments

        //Bi-Predicate: <I/p,I/p> -> returns Boolean
        BiPredicate<Integer,Integer> checker = (a,b)-> a+b>=10;
//        System.out.println(checker.test(5,1));
//        System.out.println(checker.test(5,10));

        //BiFunction: <I/p,I/p,O/p> - generate O/p Based On I/p
        BiFunction<Integer,Integer,Integer> divide = (a,b)-> a/b;
//        System.out.println(divide.apply(10,5));

        //BiConsumer:
        BiConsumer<Integer,Integer> sum = (a,b) -> System.out.println(a+b);
        sum.accept(5,96);

        //Bi-Supplier doesn't exist - it doesn't take any inputs

        //These Functional Interfaces works only on single I/p or double I/p.
    }

}
