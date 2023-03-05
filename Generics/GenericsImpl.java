package com.timothy.Generics;

import java.util.ArrayList;
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

class MultipleTypes<T,S>{
    public T printer(T t){
        return t;
    }

    public S printer1(S s){
        return s;
    }
}

class WildcardMethods{
    public List<?> sort(List<?> unknownList){
        return unknownList.stream().sorted().collect(Collectors.toList());
    }
}

class BoundedWildcardsUpper{
    //UpperBound => ? extends Number,
    // Now All subclasses of Number can be used
    public List<?> sort(List<? extends Number> unknownNumberList){
        return unknownNumberList.stream().sorted().collect(Collectors.toList());
    }
}

class BoundedWildcardsLower{
    //LowerBound => ? super Integer,
    // Now Integer class and SuperClass of Integer(Number) can be used
    // but not subclasses of Number
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
class MultipleBoundedGenerics<T extends dummyA & dummyB & dummyC> {
    //Order is important while extending *Class needs to be extended and
    // followed by Interfaces
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

        IntegerSort integerSort = new IntegerSort();
//        System.out.println(integerSort.sort(integerList));
        CharacterSort characterSort = new CharacterSort();
//        System.out.println(characterSort.sort(characterList));

        GenericSort<Character> characterGenericSort = new GenericSort<>();
//        System.out.println(characterGenericSort.sort(characterList));
        GenericSort<Integer> integerGenericSort = new GenericSort<>();
//        System.out.println(integerGenericSort.sort(integerList));

        MultipleTypes<Integer,String> integerStringMultipleTypes = new MultipleTypes<>();
//        System.out.println(integerStringMultipleTypes.printer(123));
//        System.out.println(integerStringMultipleTypes.printer1("hello"));

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
