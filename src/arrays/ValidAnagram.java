package arrays;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagramBrute(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa,ta);
    }

    public static void main(String ...args) {
        System.out.println(isAnagramBrute("rat", "car"));
    }
}
