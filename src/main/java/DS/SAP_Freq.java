package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SAP_Freq {
    public static void main(String[] args) {
        int ar[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 2;
        List<Integer> list = new ArrayList<>();
        for (int i : ar) {
            list.add(i);
        }
        System.out.println(Collections.frequency(list,x));

    }
}
