package util;

import java.util.Random;

/**
 * Created by chris luczkow on 4/25/2018.
 */
public class Rnd {

    private final static String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String String(int len) {

        Random random = new Random();
        char[] s = new char[len];
        for (int i = 0; i < len; i++) {
            s[i] = chars.charAt(random.nextInt(chars.length()));
        }
        return new String(s);
    }
}
