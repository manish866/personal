package DS;

import java.util.*;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ArrayList s1 = new ArrayList();
        for (char c : s.toCharArray()) {
            s1.add(c);
        }
        Collections.sort(s1);
        ArrayList s2 = new ArrayList();
        for (char c : t.toCharArray()) {
            s2.add(c);
        }
        Collections.sort(s2);
        if (s1.equals(s2))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
