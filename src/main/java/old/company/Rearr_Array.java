package com.company;
import java.util.Scanner;

public class Rearr_Array {
    public static void main(String[] args) {

        int a[] = new int [10];
        //int[] a = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int i,j,temp,n;
        //System.out.println("Enter limit");
        Scanner sc = new Scanner(System.in);
        //n=sc.nextInt();
        System.out.println("Enter element");
        for (i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a.length;j++)
            {
                if(a[j]==i)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    break;
                }
            }

        }
        for (i=0;i<a.length;i++)
        {
            if(a[i]!=i)
                a[i]=-1;
        }
        System.out.println("////////////////////////");
        for (i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}
