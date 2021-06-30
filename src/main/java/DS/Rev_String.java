package DS;

public class Rev_String {
    public static void main(String[] args) {
        String str = "Manish";
        char[] cha = str.toCharArray();
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.println(cha[i]);
        }


    }
}
