package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Longest_Duplicate_Substring {
    public static void main(String[] args) {
        String s = "banana";
        List<Character> dup = new ArrayList<>();
         Set <Character> res = new HashSet<>();
        char ch[] = new char[s.length()];
        int co=0;
        for (char c : s.toCharArray()) {
            if(!res.contains(c))
                res.add(c);
            else {
                dup.add(c);
            }

        }
        StringBuilder str = new StringBuilder();
        for (Character character : dup) {
            str.append(character);
        }
        System.out.println(str);




    }
}
