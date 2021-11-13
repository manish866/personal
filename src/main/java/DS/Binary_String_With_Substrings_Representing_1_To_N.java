package DS;

public class Binary_String_With_Substrings_Representing_1_To_N {
    public static void main(String[] args) {
        String s = "0110";
        int n =4;
        for (int i = 1; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            if(!s.contains(bin))
                System.out.println("false");


        }
    }
}
