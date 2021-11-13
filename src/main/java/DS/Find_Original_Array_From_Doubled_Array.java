package DS;

import java.util.ArrayList;
import java.util.List;

public class Find_Original_Array_From_Doubled_Array {
    public static void main(String[] args) {
        int changed[] = {1,3,4,2,6,8};
        List<Integer> list = new ArrayList<>();
        List<Integer> container = new ArrayList<>();

        for (int i = 0; i < changed.length; i++) {
            container.add(changed[i]);
        }
        int sum=0;
        for (int i = 0; i < changed.length; i++) {
            sum=changed[i]*2;
            if(container.contains(sum)) {
                list.add(changed[i]);
            }
        }
        System.out.println(list);


    }
}
