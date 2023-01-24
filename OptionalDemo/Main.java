package com.timothy.OptionalDemo;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student(1,"Scott", Arrays.asList("Jake","Nancy"));
        System.out.println(s1.getName());
        System.out.println(s1.getName().toUpperCase());
        Student s2= new Student(2,null, Arrays.asList("Nick","Carrie"));
        System.out.println(s2.getName());
//        System.out.println(s2.getName().toUpperCase());
        // NullPointerException
        // Cannot invoke "String.toUpperCase()" because the return value of "com.timothy.OptionalDemo.Student.getName()" is null

        // To avoid and Handle these types of Exception, we define null checks

        if(s2.getName()!=null)
            System.out.println(s2.getName().toUpperCase());
        //But we can't keep null checks for a large number of returning values/objects

        //So, Optional Class was introduced,..
        // It's a container which is returned to the user, the container either contains a value or it doesn't a value
        // Now, the user needs to handle the container which is returned.

        //Optional.empty() - Explicitly returning a empty container - Output: Optional.empty
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional.of(methodCall) - If we know the container will always return a value - Output: Optional[Scott]
        Optional<String> nameOptionalOf = Optional.of(s1.getName());
        System.out.println(nameOptionalOf);

        //Optional.ofNullable(methodCall) - If we are not sure about the return value is a non-null or null
        //Output: if Null     : Optional.empty
        //        if Non-Null : Optional[ReturnValue]
        Optional<String> nameOptionalOfNullable = Optional.ofNullable(s2.getName());
        System.out.println(nameOptionalOfNullable);



        //If we want to unwrap the values from the Optional Container,

        Student s3= new Student(3,"Monica", Arrays.asList("John","Nisha"));
        Student s4= new Student(4,null, Arrays.asList("Colt","Christy"));

        Optional<String> nameOptional3 = Optional.ofNullable(s3.getName());
        Optional<String> nameOptional4 = Optional.ofNullable(s4.getName());

        //To check if returned container is empty
        if(nameOptional3.isEmpty())
            System.out.println("Container Empty S3");
        if(nameOptional4.isEmpty())
            System.out.println("Container Empty S4");

        //Traditional Way - unwrapping values -
        // if condition checks if the value is present in the container or not, then gets the value out of container,
        // but this is no difference than the null checks we had earlier..
        if(nameOptional3.isPresent())
            System.out.println(nameOptional3.get());

        if(nameOptional4.isPresent())
            System.out.println(nameOptional4.get());

        //Best Way to unwrapping values

        // Method 1 : .orElse()
        //If value is present inside the container, it returns the value or returns a default Value we provide
        System.out.println(nameOptional3.orElse("Null Value s3"));
        System.out.println(nameOptional4.orElse("Null Value s4"));

        //Method 2 :    .orElseGet()
        //If value is present inside the container, it returns the value, or it takes a supplier
        System.out.println(nameOptional3.orElseGet(()-> new String("Empty")));
        System.out.println(nameOptional4.orElseGet(()-> new String("Empty")));

        //Method 3 :    .orElseThrow()
        //If value is present inside the container, it returns the value or NoSuchElementException
        System.out.println(nameOptional3.orElseThrow());
//        System.out.println(nameOptional4.orElseThrow());

        //Method 4 :    .orElseThrow()
        //If value is present inside the container, it returns the value or custom Exception - Supplier
        System.out.println(nameOptional3.orElseThrow(()->new RuntimeException("Empty")));
//        System.out.println(nameOptional4.orElseThrow(()->new RuntimeException("Empty Exception")));
        System.out.println(Main.getDetails(Optional.of(null)));
    }
    static Optional<String> getDetails(Optional<Integer> age){
        return Optional.ofNullable("I'm Paul and my age is "+age.orElseThrow());
    }
}
