package com.company;

import java.util.Scanner;

public class ArrEleComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        int i;
        System.out.println("Enter element");
        for (i=0;i<a.length;i++)
            a[i]=sc.nextInt();
    }
}
