package DS;

import java.util.LinkedList;
import java.util.List;

public class Remove_Linked_List_Elements {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.addLast(1);
        ls.addLast(2);
        System.out.println(ls);
        ls.remove(0);
        System.out.println(ls);
    }
}
