package DS;

import java.util.HashSet;
import java.util.Set;

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int res[] = new int[10000];
        int k=2;
        int c=0;
        Set <Integer> hr = new HashSet<>();
        for (int i=0;i<arr.length;i++) {
            hr.add(arr[i]);
        }
        for (int i=1;i<10000;i++)
        {
            if(!hr.contains(i))
                res[c++]=i;
        }
        System.out.println(res[k-1]);

    }
}
