package DS;

import java.util.ArrayList;
import java.util.List;

public class Maximum_69_Number {
    public static void main(String[] args) {
        int num = 9669;
        char[] str = String.valueOf(num).toCharArray();
        for (int i = 0; i < str.length; i++) {
            if(str[i]=='6')
            {
                str[i] = '9';
                break;
            }
        }
        int n = Integer.parseInt(String.valueOf(str));
        System.out.println(n);
    }
}
