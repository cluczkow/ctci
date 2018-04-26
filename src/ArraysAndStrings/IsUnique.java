package ArraysAndStrings;

import util.Rnd;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chris luczkow on 4/25/2018.
 */
public class IsUnique {

    public static void main(String[] args) {

        String s = Rnd.String(10);
        System.out.println(s);
        System.out.println("isUnique = " + isUnique(s));
    }

    private static boolean isUnique(String s) {

        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                return false;
            }
            chars.add(s.charAt(i));
        }
        return true;
    }
}
