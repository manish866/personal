package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class accenture {
    public static void main(String[] args) {


    int ar[][] = {{11,2,4},{4,5,6},{10,8,-12}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] +" ");
            }
            System.out.println();
        }
        int sum1=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if(i==j)
                    sum1+=ar[i][j];
            }
        }
        System.out.println(sum1);
        for (int i = ar.length; i > 0; i--) {
            for (int j = ar[0].length; j > 0; j--) {

            }
        }

    }
}
