package DS;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DEMO {
    public static void main(String[] args) {
        int nums[] = {10,4,6,7,3};
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        int tot = 0;
        List<Integer> fin = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int prev = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                int sum = 0;
                 sum*=list.get(i);
                 tot = 0;
                 tot*=prev;
            }
            list.add(tot);
        }


    }
}
