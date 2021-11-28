package DS;

import java.util.Arrays;

public class Raman_ANZ {
    public static void main(String[] args) {
        int arr[] = {2 ,1 ,3 ,4 ,6 ,3 ,2};
        int count = 0;
        int k = 6;
        int i = 0;

        Arrays.sort(arr);
        for (int index : arr) {
            System.out.println(index + " ");
        }
        int j = arr.length-1;
        while (i<j)
        {
            int res = arr[i]+arr[j];
            if(res==k)
            {
                count++;
                i++;
                j--;
            }
            if(res>)

        }

    }
}
