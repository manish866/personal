package DS;

import java.util.Scanner;

public class Array_Max_Min_Ele {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int max=0,min=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        for (int i=0;i<5;i++)
        {
            if(min<arr[i])
                max=arr[i];
            else
                min=arr[i];
        }
        System.out.println("Mim= "+min+"Max= "+max);
    }
}
