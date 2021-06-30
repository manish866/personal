package DS;

import java.util.*;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String s = "tree";
        Set <Character> res = new TreeSet<>();
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if(!res.contains(c));
                res.add(c);
        }
        System.out.println(res.toString());



    }
}
