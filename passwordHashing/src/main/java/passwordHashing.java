import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import java.util.Arrays;
import java.util.Scanner;

public class passwordHashing {
    public static void main(String[] args) {
        char[] password = "password".toCharArray();
        String hash = generateHash(password).substring(30);

        Argon2 argon2 = Argon2Factory.create();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your password");
        String userIp = sc.nextLine();

        if (argon2.verify("$argon2i$v=19$m=65536,t=20,p=1" + hash, userIp)) {
            System.out.println("password matches");
        } else System.out.println("password doesn't match");
    }

    public static String generateHash(char[] password) {
        String hash;
        Argon2 argon2 = Argon2Factory.create();

        try {
            hash = argon2.hash(20, 65536, 1, password);
        } finally {
            argon2.wipeArray(password);
        }
//        printer(password);
        return hash;
    }

    public static void printer(char[] password) {
        System.out.println(Arrays.toString(password));
    }

}
