package DS;

import java.util.HashSet;
import java.util.Set;

public class Number_of_Different_Integers_in_a_String {
    public static void main(String[] args) {
        String word = "a123bc34d8ef34";
        String replaced = word.replaceAll("[a-z]"," ");
        Set<String> set = new HashSet<>();
        String[] dup = replaced.split(" ");
        for (String s : dup) {
            if(s.trim().length()>0)
                set.add(s.replaceAll("^0*",""));
        }
        System.out.println(set);
    }
}
