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
    public static boolean isAnagramOptimal(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) count[c - 'a']++;

        for (char c : t.toCharArray()) count[c - 'a']--;

        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }

    public static void main(String ...args) {
        System.out.println(isAnagramOptimal("anna", "nana"));
    }
}
