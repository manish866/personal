package DS;

import java.util.Locale;

public class Rec_Permutation_with_Case_Change {
    public static void main(String[] args) {
        String str = "ab";
        String input = str;
        String output = "";
        recustion(input,output);
    }
    public static void recustion(String input,String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        StringBuilder out1 = new StringBuilder(output);
        StringBuilder out2 = new StringBuilder(output);
        out1.append(input.charAt(0));
        out2.append(Character.toUpperCase(input.charAt(0)));
        
        StringBuilder in = new StringBuilder(input);
        in.deleteCharAt(0);
        recustion(in.toString(),out1.toString());
        recustion(in.toString(),out2.toString());



    }
}
