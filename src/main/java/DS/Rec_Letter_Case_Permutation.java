package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Rec_Letter_Case_Permutation {
    public static void main(String[] args) {
        String input = "a1b2";
        String output = " ";
        recurtion(input,output);
    }
    public static void recurtion(String input,String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        if(Character.isAlphabetic(input.charAt(0)))
        {
            String out1 = String.valueOf(input.charAt(0)).toUpperCase(Locale.ROOT);
            String out2 = String.valueOf(input.charAt(0)).toLowerCase(Locale.ROOT);
            StringBuilder in = new StringBuilder(input);
            in.deleteCharAt(0);
            recurtion(in.toString(),out1);
            recurtion(in.toString(),out2);

        }
        else {
            String out1 = String.valueOf(input.charAt(0));
            StringBuilder in = new StringBuilder(input);
            in.deleteCharAt(0);
            recurtion(in.toString(),out1);
        }



    }
}
