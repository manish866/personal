package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bhargav_ANZ {
    public static void main(String[] args) {
        int startI = 0 ;
        int endJ = 0;
        int ar[] = {1, 1, 1, 4, 8, 10, 0, 0, 0, 0, 4, 8, -1, -1, -1, -1, -1, -1 };
        int dif[] = new int[ar.length-1];
        int x = 0;

        for (int i = 0; i < ar.length-1; i++) {
            dif[i] = Math.abs(ar[i]-ar[i+1]);
        }
        int finalI = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dif.length; i++)
        {
            if(count==0)
                startI = i;
            if(dif[i]<=x)
            {
                count++;
            }
            if(max<count) {
                max = count;
                finalI = startI;
                endJ = i;
            }
            if(dif[i]>x)
            {
                count = 0;
            }
        }
        for (int i = finalI; i <= endJ + 1; i++) {
            System.out.print(ar[i]+" ");
        }



    }
}
