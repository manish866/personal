package DS;

import java.util.Scanner;

public class Rec_Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fa=0;
        fa  = fact(n);
        System.out.println(fa);
    }

    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return fact(n-1)*(n);

    }
}
