package DS;

import java.util.*;
import java.util.Stack;

public class Append_and_Delete {
    public static void main(String[] args) {
        String s = "hackerhappy";
        String t = "hackerrank";
        int k = 9;
        Stack<Character> st = new Stack<>();
        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            st.push(c);
        }
        for (int i = t.toCharArray().length - 1; i >= 0; i--) {
            char c = t.charAt(i);
            if(st.peek()==c)
                st.pop();
        }
        System.out.println(st);
    }
}
