package com.timothy.Generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class IntegerSort {
    public  List<Integer> sort(List<Integer> integerList) {
        return integerList.stream().sorted().collect(Collectors.toList());
    }
}

class CharacterSort {
    public  List<Character> sort(List<Character> characterList) {
        return characterList.stream().sorted().collect(Collectors.toList());
    }
}

class GenericSort<T>{
    public List<T> sort(List<T> genericList){
        return genericList.stream().sorted().collect(Collectors.toList());
    }
}

class IntegerPrinter{
    public Integer Printer(Integer integer){
        return integer;
    }
}
class StringPrinter{
    public String Printer(String string){
        return string;
    }
}
class GenericPrinter<T>{
    public T genericPrinter(T t){
        return t;
    }
}
interface D<T>{
    T printer(T t);
}

class MultipleTypes<T,S>{
    public T printer(T t){
        return t;
    }

    public S printer1(S s){
        return s;
    }
}

class BoundedGenerics<T extends Number>{
    public List<T> sort(List<T> boundedGenericList){
        return boundedGenericList.stream().sorted().collect(Collectors.toList());
    }
}


class WildcardMethods{
    public List<?> sort(List<?> unknownList){
        return unknownList.stream().sorted().collect(Collectors.toList());
    }
}

class UpperBoundedWildCards {
    public List<?> sort(List<? extends Number> unknownNumberList){
        return unknownNumberList.stream().sorted().collect(Collectors.toList());
    }
}

class LowerBoundedWilCards {
    public List<?> sort(List<? super Integer> unknownNumberList){
        return unknownNumberList.stream().sorted().collect(Collectors.toList());
    }
}

class  A {
}
interface B {
}
interface C {
}
class MultipleBoundedGenerics<T extends A & B & C>{

    public List<T> sort(List<T> multipleBoundedGenericList){
        return multipleBoundedGenericList.stream().sorted().collect(Collectors.toList());
    }
}




public class GenericsImpl {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2, 4, 1, 0, 6);
        List<Character> characterList =
                Arrays.asList('n','i','x','f','b','p','c','l','v','a');
        List<Float> floatList = Arrays.asList(1.1f,0.5f,0.09f,5.7f,2.9f);
        List<Double> doubleList = Arrays.asList(1.0,6.9,3.9,5.6,2.3);

        IntegerSort integerSort = new IntegerSort();
        System.out.println(integerSort.sort(integerList));

        CharacterSort characterSort = new CharacterSort();
        System.out.println(characterSort.sort(characterList));

        GenericSort<Character> characterGenericSort = new GenericSort<>();
        System.out.println(characterGenericSort.sort(characterList));
        GenericSort<Integer> integerGenericSort = new GenericSort<>();
        System.out.println(integerGenericSort.sort(integerList));

        IntegerPrinter integerPrinter = new IntegerPrinter();
        System.out.println(integerPrinter.Printer(1));

        StringPrinter stringPrinter = new StringPrinter();
        System.out.println(stringPrinter.Printer("Hello"));

        GenericPrinter<Character> genericPrinter = new GenericPrinter<>();
        System.out.println(genericPrinter.genericPrinter('c'));
        GenericPrinter<Integer> genericPrinter1 = new GenericPrinter<>();
        System.out.println(genericPrinter1.genericPrinter(123));


        MultipleTypes<Integer,String> integerStringMultipleTypes = new MultipleTypes<>();
//        MultipleTypes<String> stringMultipleTypes = new MultipleTypes<>();
//        System.out.println(integerStringMultipleTypes.printer(123));
        System.out.println(integerStringMultipleTypes.printer1("hello"));

        WildcardMethods wildcardMethods = new WildcardMethods();
        System.out.println(wildcardMethods.sort(integerList));
        System.out.println(wildcardMethods.sort(characterList));

        BoundedGenerics<Integer> integerBoundedGenerics = new BoundedGenerics<>();
        System.out.println(integerBoundedGenerics.sort(integerList));
        BoundedGenerics<Double> doubleBoundedGenerics = new BoundedGenerics<>();
        System.out.println(doubleBoundedGenerics.sort(doubleList));
//        BoundedGenerics<Character> boundedGenericsCharacter = new BoundedGenerics<>(); // error

        UpperBoundedWildCards upperBound = new UpperBoundedWildCards();
        System.out.println(upperBound.sort(integerList));
        System.out.println(upperBound.sort(doubleList));
//        System.out.println(upperBound.sort(characterList)); // error

        LowerBoundedWilCards lowerBound = new LowerBoundedWilCards();
        System.out.println(lowerBound.sort(integerList));
//        System.out.println(lowerBound.sort(floatList));
//        System.out.println(lowerBound.sort(doubleList)); // error
    }
}
