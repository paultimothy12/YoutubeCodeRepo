package com.timothy.Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


//compile time feature
//https://docs.oracle.com/javase/tutorial/java/generics/erasure.html

//When bytecode is generated, it contains normal classes,methods and interfaces,
// Therefore it doesn't know the type T and replace with Object,
// primitive datatype doesn't extend Object Class but wrapper class does.

class IntegerSort {

    public static List<Integer> sort(List<Integer> integerList) {
        return integerList.stream().sorted().collect(Collectors.toList());
    }
}

class CharacterSort {
    public static List<Character> sort(List<Character> characterList) {
        return characterList.stream().sorted().collect(Collectors.toList());
    }
}

class GenericSort<T>{
    public List<T> sort(List<T> genericList){
        return genericList.stream().sorted().collect(Collectors.toList());
    }
}
class WildcardMethods{
    public List<?> sort(List<?> unknownList){
        return unknownList.stream().sorted().collect(Collectors.toList());
    }
}
class BoundedWildcardsUpper{

    //UpperBound => ? extends Number, Now All subclasses of Number can be used
    public List<?> sort(List<? extends Number> unknownNumberList){
        return unknownNumberList.stream().sorted().collect(Collectors.toList());
    }

}
class BoundedWildcardsLower{
    //LowerBound => ? super Integer, Now Integer class and SuperClass of Integer(Number) can be used but not subclasses of Number
    public List<?> sort(List<? super Integer> unknownNumberList){
        return unknownNumberList.stream().sorted().collect(Collectors.toList());
    }
}
class BoundedGenerics<T extends Number>{
    public List<T> sort(List<T> boundedGenericList){
        return boundedGenericList.stream().sorted().collect(Collectors.toList());
    }
}
class dummyA{

}
interface dummyB{

}
interface dummyC{

}
class MultipleBoundedGenerics<T extends dummyA & dummyB & dummyC>{
    //Order is important while extending *Class needs to be extended and followed by Interfaces
    public List<T> sort(List<T> boundedGenericList){
        return boundedGenericList.stream().sorted().collect(Collectors.toList());
    }
}

public class GenericsImpl {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2, 4, 1, 0, 6);
        List<Character> characterList = Arrays.asList('n','i','x','f','b','p','c','i','v','a');
        List<Float> floatList = Arrays.asList(1.1f,0.5f,0.09f,5.7f,2.9f);


//        System.out.println(IntegerSort.sort(integerList));
//        System.out.println(CharacterSort.sort(characterList));

        GenericSort<Character> characterGenericSort = new GenericSort<>();
//        System.out.println(characterGenericSort.sort(characterList));
        GenericSort<Integer> integerGenericSort = new GenericSort<>();
//        System.out.println(integerGenericSort.sort(integerList));

        WildcardMethods wildcardMethods = new WildcardMethods();
//        System.out.println(wildcardMethods.sort(integerList));
//        System.out.println(wildcardMethods.sort(characterList));

        BoundedWildcardsUpper boundedWildcardsNumber = new BoundedWildcardsUpper();
//        System.out.println(boundedWildcardsNumber.sort(integerList));
//        System.out.println(boundedWildcardsNumber.sort(floatList));
//        System.out.println(boundedWildcardsNumber.sort(characterList)); // error

        BoundedWildcardsLower boundedWildcardsLower = new BoundedWildcardsLower();
//        System.out.println(boundedWildcardsLower.sort(integerList));
//        System.out.println(boundedWildcardsLower.sort(floatList)); // error

        BoundedGenerics<Integer> boundedGenericsInteger = new BoundedGenerics<>();
//        System.out.println(boundedGenericsInteger.sort(integerList));
//        BoundedGenerics<Character> boundedGenericsCharacter = new BoundedGenerics<>(); // error

    }
}
