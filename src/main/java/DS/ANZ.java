package DS;

import java.util.*;

public class ANZ {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-2);
        list.add(-1);
        list.add(3);
        //int ar[] = new int[list.size()];
        //Arrays.sort(ar);
        int min = Integer.MAX_VALUE;
        Collections.sort(list);

//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                int res = Math.abs(list.get(i)-list.get(j));
//                if(min>res)
//                    min=res;
//            }
//        }
        for (int i = 0; i < list.size()-1; i++) {
            int res = Math.abs(list.get(i)-list.get(i+1));
            if(min>res)
                min=res;
        }
       System.out.println(min);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                int res = Math.abs(list.get(i)-list.get(j));
                if(res==min)
                {
                    System.out.println(list.get(i)+" "+list.get(j));
                }
            }
        }
    }
}

