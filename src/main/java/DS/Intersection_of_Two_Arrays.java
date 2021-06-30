package DS;

import java.util.*;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int num1[] = {4,9,5};
        int num2[] = {9,4,9,8,4};

        Set<Integer> h1 = new HashSet<>();
        Set<Integer> h2 = new HashSet<>();
        for (int i : num1) {
            h1.add(i);
        }
        for (int i : num2) {
            h2.add(i);
        }
        int res[] = new int[h1.size()];
        int i=0;
        h1.retainAll(h2);
        Iterator<Integer> itr = h1.iterator();
        while (itr.hasNext())
            res[i++]=itr.next();

        for (int re : res) {
            System.out.println(re);

        }


    }
}
