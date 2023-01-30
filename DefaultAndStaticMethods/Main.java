package com.timothy.DefaultAndStaticMethods;

//@FunctionalInterface
interface InterfaceDemo{
    //Abstract Methods
    void AbstractMethod1(String s);
    void AbstractMethod2(String k);

    //Default Methods
    default void DefaultPrinter1(){
        System.out.println("Default1");
    }
    default void DefaultPrinter2(){
        System.out.println("Default2");
    }

    //Static Methods -> Cannot override
    static void StaticPrinter1(){
        System.out.println("Static1");
    }
    static void StaticPrinter2(){
        System.out.println("Static2");
    }

    //We cannot override Object Class Methods
//    default String toString(){
//
//    }
//    default int hashCode(){
//
//    }
}
class dummyClass implements InterfaceDemo{
    //Implementation Class must override all "Abstract methods" in the interface
    @Override
    public void AbstractMethod1(String s) {
        System.out.println("Abstract1 "+s);
    }

    @Override
    public void AbstractMethod2(String k) {
        System.out.println("Abstract2 "+k);
    }

    //We can also change default method implementation provided in the interface
    @Override
    public void DefaultPrinter1() {
        System.out.println("Default Method1 New Implementation");
    }

    @Override
    public void DefaultPrinter2() {
        System.out.println("Default Method2 New Implementation");
    }
}
public class Main {
    public static void main(String[] args) {
        //Static methods in Interface can be called directly using Interface Name, so we cannot override a static method
        InterfaceDemo.StaticPrinter1();
        InterfaceDemo.StaticPrinter2();

        dummyClass dummyObj = new dummyClass();
        //Abstract Method Call
        dummyObj.AbstractMethod1("method called");
        dummyObj.AbstractMethod2("method called");

        //Default Method Call
        dummyObj.DefaultPrinter1();
        dummyObj.DefaultPrinter2();
    }
}
