package DS;

import java.util.Scanner;



public class Rev_Array {

static void Rev(int arr[],int s,int e)
{
    int temp;
    while (s<e)
    {
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }


}
static void print(int arr[],int n)
{
    for (int i=1;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}


    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Element");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        Rev(arr,0,5);
        print(arr,6);



    }
}
