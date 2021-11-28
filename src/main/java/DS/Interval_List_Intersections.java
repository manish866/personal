package DS;

import java.util.ArrayList;
import java.util.List;

public class Interval_List_Intersections {
    public static void main(String[] args) {
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};

        int fIndex = 0;
        int sIndex = 0;

        int mS,mE;

        List<int[]> list = new ArrayList<>();

        while (fIndex<firstList.length && sIndex<secondList.length)
        {
            mS = Math.max(firstList[fIndex][0],secondList[sIndex][0]);
            mE = Math.min(firstList[fIndex][1],secondList[sIndex][1]);

            if(mE>=mS)
            {
                list.add(new int[]{mS,mE});
            }
            if(firstList[fIndex][1]==mE)
                fIndex++;
            if(secondList[sIndex][1]==mE)
                sIndex++;
        }
        for (int[] i : list) {
            System.out.println(i);
        }
    }
}
