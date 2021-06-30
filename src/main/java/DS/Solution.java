package DS;

import java.util.Scanner;

public class Solution {
    static boolean checkpalindrome(String word)
    {
        int n=word.length();
        word=word.toLowerCase();
        for(int i=0;i<n;i++,n--)
            if(word.charAt(i)!=word.charAt(n-1))
                return false;
        return true;

    }
    static int countpalindrome(String str)
    {
        str=str+" ";
        String word = "";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
                word+=ch;
            else if(checkpalindrome(word))
                count++;
            word="";
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String main="";
        main=sc.nextLine();
        int c=countpalindrome(main);
        System.out.println(c);

    }
}
