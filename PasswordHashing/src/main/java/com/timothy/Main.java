package com.timothy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String password ="myPassword";
        System.out.println(password);
        char[] passwordArr ={'p','a','s','s'};
        System.out.println(passwordArr);

        System.out.println(password.hashCode());
        password="newPassword";
        System.out.println(password);
        System.out.println(password.hashCode());

        System.out.println(passwordArr.hashCode());
        Arrays.fill(passwordArr,'*');
        System.out.println(passwordArr);
        System.out.println(passwordArr.hashCode());
    }
}
