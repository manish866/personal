package DS;

public class Break_a_Palindrome {
    public static void main(String[] args) {
        String palindrome = "abccba";
        char[] ch = palindrome.toCharArray();
        for (int i = 0; i < ch.length/2; i++) {
            if(ch[i]!='a')
            {
                ch[i]='a';
                System.out.println(String.valueOf(ch));
            }
            ch[ch.length - 1 ] = 'b';

        }
        System.out.println(String.valueOf(ch));
    }
}
