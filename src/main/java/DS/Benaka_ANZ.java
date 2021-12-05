package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Benaka_ANZ {
    public static void main(String[] args) {
        List<Integer> payments = new ArrayList<>();
        payments.add(40);
        payments.add(150);
        payments.add(50);
        payments.add(50);
        payments.add(60);
        payments.add(800);
        payments.add(1000);
        payments.add(1050);
        System.out.print(payments+" ");
        Map<Integer,Integer> rem = new HashMap<>();
        for (Integer i : payments) {
            int res = i%100;
            int k=i/100;
            if(k!=0)
                res=res-1;
            if(res!=0)
                rem.put(res,rem.getOrDefault(res,0)+1);
        }
        int count = 0;
        for (Integer i : payments) {
            int x = i/100;
            int y= (x+1)*100 - i;
            if(rem.containsKey(y))
                count+=rem.get(y);

        }
        System.out.println(count/2);

    }
}
