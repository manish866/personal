package DS;

import java.util.ArrayList;
import java.util.List;

public class Shuffle_String {
    public static void main(String[] args) {
        String s = "aiohn";
        int indices[] = {3,1,4,2,0};
        char[] ch = new char[indices.length];
        for (int i = 0; i < s.toCharArray().length; i++) {
            ch[indices[i]]=s.charAt(i);
        }
        for (char c : ch) {
            System.out.println(c);
        }


    }
}
