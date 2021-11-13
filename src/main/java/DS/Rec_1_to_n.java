package DS;

import java.util.Scanner;

public class Rec_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printt(n);
    }
    public static void printt(int n)
    {
        if(n==0)
            return ;

        printt(n-1);
        System.out.println(n);

    }
}
