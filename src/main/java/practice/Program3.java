package practice;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Manish");
        Scanner sc = new Scanner(System.in);
        System.out.println("String: "+sb);
        System.out.println("Appended "+sb.append(" Dongarekar"));
        System.out.println("Length of string is :"+sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
        String str = sb.toString();
        System.out.println(str.toUpperCase());
    }
}
