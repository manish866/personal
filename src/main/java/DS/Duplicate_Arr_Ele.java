package DS;

public class Duplicate_Arr_Ele {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
