package DS;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n = 3;
        int res[][] = new int[n][n];
        int colBegin = 0;
        int colEnd =  n-1;
        int rowBegin = 0;
        int rowEnd = n-1;
        int num = 1;
        while (colBegin<=colEnd && rowBegin<=rowEnd)
        {
            for (int i = colBegin; i <= colEnd; i++) {
                res[rowBegin][i] = num++;

            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                res[i][colEnd] = num++;
            }
            colEnd--;
            if(rowBegin<=rowEnd)
            {
                for (int i = colEnd; i >= colBegin; i--) {
                    res[rowEnd][i]=num++;
                }
                rowEnd--;
            }
            if (colBegin<=colEnd)
            {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res[i][colBegin]=num++;
                    
                }
                colBegin++;
            }


        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
