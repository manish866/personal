package DS;

import java.util.ArrayList;
import java.util.List;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String text1 = "ezupkr";
        String text2 = "ubmrapg";
        List<Character> list = new ArrayList<>();
        for (char c : text1.toCharArray()) {
            list.add(c);
        }
        int count=0;
        for (char c : text2.toCharArray()) {
            if(!list.contains(c))
                list.remove(c);
        }
        System.out.println(list);
    }
}
