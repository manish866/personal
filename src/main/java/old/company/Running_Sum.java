package com.company;

import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        int a[] = new int [10];
        int b[] = new int [10];
        int i,j,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        System.out.println("Enter element");
        for (i=0;i<n;i++)
            a[i]=sc.nextInt();
        b[0]=a[0];
        for(i=1;i<n;i++)
            b[i]=b[i-1]+a[i];
        for(i=0;i<n;i++)
            System.out.println(b[i]);

    }
}
