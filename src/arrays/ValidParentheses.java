package arrays;

import java.util.*;

public class ValidParentheses {
    private static boolean isMatched(char open, char close) {
        if(
            (open == '(' && close == ')' ) ||
            (open == '[' && close == ']' ) ||
            (open == '{' && close == '}' )
        )
            return true;
        return false;
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i  = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) {
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()) return false;

                char ch = st.peek();
                st.pop();

                if(!isMatched(ch, s.charAt(i))) return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String ...args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
