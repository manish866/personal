package DS;

public class Rec_Subsets {
    public static void main(String[] args) {
        String input = "abc";
        String output= " ";
        solve(input,output);
    }
    public static void solve(String input,String output)
    {
        if(input.length()==0) {
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out2+=input.charAt(0);
        input=input.substring(1);

        solve(input,out1);
        solve(input,out2);
    }
}
