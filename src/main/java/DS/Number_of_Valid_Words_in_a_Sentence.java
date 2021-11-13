package DS;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Valid_Words_in_a_Sentence {
    public static void main(String[] args) {
        String sentence  = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
        String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        //String r2 = "[^0-9]+"
        String arr[]=sentence.split("\\s+");
        int count=0;
        for (String s : arr)
        {
            if(s.matches(regex))
                count++;
        }
        System.out.println(count);
    }
}
