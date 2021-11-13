package DS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(k-1));
    }
}
