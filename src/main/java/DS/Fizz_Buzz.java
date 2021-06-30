package DS;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
    public static void main(String[] args) {
        int n=3;
        int co=0;
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0)
                res.add("FizzBuzz");
            else if(i%3==0)
                res.add("Fizz");
            else if (i%5==0)
                res.add("Buzz");
            else {
                String str = String.valueOf(i);
                res.add(str);
            }
        }
        System.out.println(res);
    }
}
