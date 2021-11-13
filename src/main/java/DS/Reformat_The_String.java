package DS;

import java.util.ArrayList;
import java.util.List;

public class Reformat_The_String {
    public static void main(String[] args) {
        String s = "covid2019";
        StringBuilder ch = new StringBuilder();
        StringBuilder no =new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c))
                no.append(c);
            else ch.append(c);
        }
        System.out.println(no);
        System.out.println(ch);
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        if (no.length() > ch.length())
            sb.append(no.charAt(j++));
        while (sb.length()<s.length())
        {
            sb.append(no.charAt(i++));
            if(sb.length()>=s.length())
                break;
            sb.append(ch.charAt(j++));
        }
        System.out.println(sb);

    }
}
