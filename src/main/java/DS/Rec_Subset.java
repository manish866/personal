package DS;

public class Rec_Subset {
    public static void main(String[] args) {
        String input = "aba";
        String output = "";
        Recursion(input,output);
    }
    public static void Recursion(String input,String output)
    {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out2 += input.charAt(0);
        input = input.substring(1);
        Recursion(input,out1);
        Recursion(input,out2);

    }
}
