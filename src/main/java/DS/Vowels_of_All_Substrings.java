package DS;

import java.util.HashSet;
import java.util.Set;

public class Vowels_of_All_Substrings {
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        String word = "aba";
        String input = word;
        String output = " ";
        Recurtion(input,output);
        System.out.println(set);
    }
    public static void Recurtion(String input, String output)
    {
        if(input.length()==0) {
            System.out.println(output);
            set.add(output);
            return;
        }



        String out1 = output;
        String out2 = output;
        out2+=input.charAt(0);
        input=input.substring(1);

        Recurtion(input,out1);
        Recurtion(input,out2);
    }
}
