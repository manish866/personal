package DS;

import java.util.Scanner;

public class Rec_Permutation_with_spaces {
    public static void main(String[] args) {
        String str ="";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringBuilder out = new StringBuilder();
        out.append(str.charAt(0));
        StringBuilder input = new StringBuilder();
        input.append(str.substring(1,str.length()));
        recurstion(input.toString(),out.toString());
    }
    public static void recurstion(String input,String output)
    {
        if(input.length()==0) {
            System.out.println(output);
            return;
        }
        StringBuilder out1 = new StringBuilder(output);
        StringBuilder out2 = new StringBuilder(output);
        out1.append(" ");
        out1.append(input.charAt(0));
        out2.append(input.charAt(0));
        StringBuilder inputt = new StringBuilder(input);
        inputt.deleteCharAt(0);

        recurstion(inputt.toString(),out1.toString());
        recurstion(inputt.toString(),out2.toString());
    }
}
