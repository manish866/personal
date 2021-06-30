package com.company;
import java.util.Scanner;

public class Remove_Duplicate_element {
    public static void main(String[] args) {
        int a[] = new int [10];
        int n,i,j,temp;
        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter elements");
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Elements are");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<n;i++)
        {

            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for (j=i; j<n; j++)
                        n=n-1;
                        a[j] = a[j+1];
                }
            }
        }
        System.out.println("duppppppppppp");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}
