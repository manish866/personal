package DS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lucky_Number {
    public static void main(String[] args) throws IOException, NumberFormatException  {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        while (n>0)
        {
            int ar[] = new int[3];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = Integer.parseInt(reader.readLine());
            }
            List<Integer> list = new ArrayList<>();
            for (int i : ar) {
                list.add(i);
            }
            if(list.contains(7))
                System.out.println("Yes");
            else System.out.println("No");

            n--;
        }

    }


}
