package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class amz {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        List<Integer> hardDiskSpace = new ArrayList<>();
        int segmentLength = 8;
        hardDiskSpace.add(10);
        hardDiskSpace.add(20);
        hardDiskSpace.add(30);
        hardDiskSpace.add(40);
        hardDiskSpace.add(25);
        hardDiskSpace.add(81);
        hardDiskSpace.add(98);
        hardDiskSpace.add(45);

        if(hardDiskSpace.size() == segmentLength){
            int min = Integer.MAX_VALUE;
            for(int i =0 ;i<hardDiskSpace.size(); i++){
                if(hardDiskSpace.get(i) < min){
                    min = hardDiskSpace.get(i);
                }
            }
            System.out.println(min);
        }
        for(int i =0 ;i< hardDiskSpace.size() - segmentLength - 1; i++){
            int min = hardDiskSpace.get(i);
            for(int j =i; j< i+segmentLength; j++){
                if(hardDiskSpace.get(j) < min){
                    min = hardDiskSpace.get(j);
                }
            }

            if(max < min){
                max = min;
            }
        }

        System.out.println(max);


    }
}
