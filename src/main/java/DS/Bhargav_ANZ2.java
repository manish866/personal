package DS;

import java.util.ArrayList;
import java.util.List;

public class Bhargav_ANZ2 {
    public static void main(String[] args) {
        int n[] = {2,7,4,8};
        int m[] = {6,10};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < n.length; j++) {
                if(m[i]>=n[j])
                {
                    count++;
                }

            }
            list.add(count);
        }
        System.out.println(list);
    }
}
