package com.timothy.Concepts.Enum;

import java.util.Arrays;

public class enumDef {
    enum Days{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    }

    enum Phones{
        iPhone(1000),Android(700),Windows();

        private int price;
        private Phones(){
        }
        private Phones(int price){
            this.price=price;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {

//        System.out.println(Days.Friday);
//
//        Days day = Days.Monday;
//        System.out.println(day);
//
//        System.out.println(Days.Saturday.ordinal());
//        System.out.println(day.ordinal());
//
//        Days[] array= Days.values();    //Object[]
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(Arrays.toString(Days.values()));
//
//        Days day1 = Days.Sunday;
//        if(day1==Days.Monday){
//            System.out.println("Equal");
//        }else System.out.println(day1.toString());

        //<=========================>
//        enum is a class, but we cannot extend other class. But we can define variables, methods, constructors....


        System.out.println(Arrays.toString(Phones.values()));

        System.out.println(Phones.iPhone);

        System.out.println(Phones.iPhone.getPrice());

        Phones phones = Phones.Windows;

        System.out.println(phones+" "+phones.getPrice());

        phones.setPrice(700);

        System.out.println(phones+" "+phones.getPrice());

        for( Phones phones1: Phones.values()){
            System.out.println(phones1+" "+phones1.getPrice());
        }
    }
}
