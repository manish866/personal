package DS;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;

public class Find_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {
        int arr[] = {2,2,2,3,4};
        int dup[] = new int[arr.length];
        int j=0;
        HashSet <Integer> hr = new HashSet<>();
        for (int i : arr)
        {
            if(!hr.contains(i))
            {
                    hr.add(i);
            }
            else
            {
                dup[j]=i;
                j++;

            }
        }
        int count=0;
        for(j=0;j<dup.length;j++)
        {
            count=count+j;
            System.out.println(dup[j]);
        }
        System.out.println(count);
    }
}
