package DS;

import java.util.Arrays;
import java.util.Scanner;

public class Given_Ele_Sum {
    public static void main(String[] args) {
        int n,k;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int ar[]= new int[n];
        int count=0,temp=0;
        int l=ar[0],h=ar.length-1;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        while(l<h)
        {
            if(ar[l]+ar[h]>k)
            {
                h--;
            }
            else if(ar[l]+ar[h]<k)
            {
                l++;
            }
            else {
                count++;
                l++;
                h--;

            }

        }

        System.out.println(count);
    }
}
