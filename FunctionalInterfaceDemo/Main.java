package com.timothy.FunctionalInterfaceDemo;
@FunctionalInterface
interface FunctionalInterface1{
    String toUpperCase(String Value);
//    String toUpperCase1(String Value);
    static void fun(){

    }
    static void printer(){

    }
    default void fun2(){

    }
}
//class dummy implements FunctionalInterface1{
//
//    @Override
//    public String toUpperCase(String Value) {
//        return Value.toUpperCase();
//    }
//}
class ImplementationClass{
    static String printName(String Name){
        return Name.toUpperCase();
    }
}
class Demo{
    void demoPrinter(String Name, FunctionalInterface1 functionalInterface1){
        Name = functionalInterface1.toUpperCase(Name);
        System.out.println(Name);
    }
}
public class Main {
    public static void main(String[] args) {
//        dummy dummy = new dummy();
//        System.out.println(dummy.toUpperCase("paul"));

        Demo demo = new Demo();
        demo.demoPrinter("Paul Timothy",ImplementationClass::printName);
        demo.demoPrinter("Johan",ImplementationClass::printName);

    }
}
