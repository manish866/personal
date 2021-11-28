package DS;

import java.util.Arrays;
import java.util.Collections;

public class Maximum_Value_after_Insertion {
    public static void main(String[] args) {
        String n = "73";
        int x = 6;
        int index = n.indexOf('-');
        StringBuilder sb = new StringBuilder(n);
        if(index==-1)
        {
            int i = 0;
            while (i<n.length())
            {
                char c = n.charAt(i);
                int num = c - '0';
                if(num<x)
                {
                    break;
                }
                i++;
                sb.insert(i,x);
            }
        }
        else if (index==0)
        {
            int i = 0;
            while (i<n.length())
            {
                char c = n.charAt(i);
                int num = c - '0';
                if(num>x)
                {
                    break;
                }
                i++;
            }
            sb.insert(i,x);
        }

        System.out.println(sb);

    }
}
