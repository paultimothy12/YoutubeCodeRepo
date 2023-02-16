package com.timothy;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2Demo {
    public static String getHash(String password, Argon2 argon2){
        String hash;
        try {
            hash = argon2.hash(20, 65536, 1, password.toCharArray());
        } finally {
            argon2.wipeArray(password.toCharArray());
        }
        return hash;
    }
    public static void main(String[] args) {

        Argon2 argon2 = Argon2Factory.create();

        String password = getHash("mypassword",argon2).substring(30);
        System.out.println(password);

        password = getHash("newpassword",argon2).substring(30);
        System.out.println(password);

        if(argon2.verify("$argon2i$v=19$m=65536,t=20,p=1"+password,"newpassword")){
            System.out.println("password matches!!!");
        }

    }
}
