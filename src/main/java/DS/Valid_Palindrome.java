package DS;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if((c>='a' && c<='z') || (c>='A' && c<='Z'))
                sb.append(c);
        }

        StringBuilder rev = sb.reverse();
        System.out.println(sb);
        System.out.println(sb.reverse());



    }
}
