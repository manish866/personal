package DS;

import java.util.HashSet;
import java.util.Set;

public class hello {
    public static void main(String[] args) {
        int n = 8;
        int j = n;
        int i = 1,count=0;
        while (i<j)
        {
            if(i+j==n) {
                count++;
                i++;
                j--;
            }
            else if(i+j<n)
                i++;
            else if(i+j>n)
                j--;
        }
        System.out.println(count);
    }
}
