package DS;

import java.util.ArrayList;
import java.util.List;

public class Bhargav_ANZ2 {
    public static void main(String[] args) {

        List<Integer> sysA = new ArrayList<>();
        sysA.add(2);
        sysA.add(4);
        sysA.add(6);
        List<Integer> sysB = new ArrayList<>();
        sysB.add(4);
        sysB.add(7);
        List<Integer> list = new ArrayList<>();


        int n[] = new int[sysA.size()];
        int m[] = new int[sysB.size()];

        for (int i = 0; i < sysA.size(); i++) {
            n[i]=sysA.get(i);
        }
        for (int i = 0; i < sysB.size(); i++) {
            m[i]=sysB.get(i);
        }
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
