package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class nokia {
    public static void main(String[] args) {
       int[] arr = {1,2,9,8,90,63,3,41,96,28};
       int k=4;
       List<Integer> asc = new ArrayList<>();
       List<Integer> decs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            asc.add(arr[i]);
        }


        for (int i = k; i < arr.length; i++) {
            decs.add(arr[i]);
        }
        Collections.sort(asc);
        Collections.sort(decs,Collections.reverseOrder());
        System.out.println(asc);
        System.out.println(decs);
        List<Integer> fina = new ArrayList<>();
        fina.addAll(asc);
        fina.addAll(decs);
        int[] res = new int[arr.length];
        for (int i = 0; i < fina.size(); i++) {
            res[i]=fina.get(i);
        }
        for (int i : res) {
            System.out.print(i + " ");
        }


    }
}
