package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Minimum_Operations_to_Make_a_Uni_Value_Grid {
    public static void main(String[] args) {
        int[][] grid = {{2,4},{6,8}};
        int x = 2;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                list.add(grid[i][j]);
            }
        }
        int count=0;
        Collections.sort(list);
        int mid = list.get(list.size()/2);
        for (Integer i : list) {
            if((mid-i)%x!=0)
                System.out.println("-1");
            else count+=Math.abs(mid-i)/x;
        }
        System.out.println(mid);
        System.out.println(list);
        System.out.println(count);


    }
}
