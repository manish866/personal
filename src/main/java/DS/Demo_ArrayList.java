package DS;

import java.util.ArrayList;

public class Demo_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(0,3);
        l2.add(00);
        l2.add(11);
        l2.add(22);

        l1.addAll(l2);
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(22));

    }
}
