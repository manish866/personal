package DS;

import java.util.ArrayList;
import java.util.List;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int mat[][] = {{1,1,1},{1,0,1},{1,1,1}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j]==0)
                {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i+=2) {
            int k = list.get(i);
            for (int j = 0; j < mat[0].length; j++) {
                mat[k][j]=0;
            }
            k=list.get(i+1);
            for (int j = 0; j < mat.length; j++) {
                mat[j][k]=0;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
