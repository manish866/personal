package DS;

public class Rotate_Image {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix.length; i1++) {
                System.out.print(matrix[i][i1] + "\t");
            }
            System.out.println();
        }
        int res[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                res[i][i1] = matrix[i1][i];

            }
        }
        for (int i = 0; i < res[0].length; i++) {
            for (int j = 0; j < res.length/2; j++) {
                int temp=0;
                temp=res[i][j];
                res[i][j]=res[i][res.length-1-j];
                res[i][res.length-1-j]=temp;
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int i1 = 0; i1 < res.length; i1++) {
                System.out.print(res[i][i1]+"\t");
            }
            System.out.println();
        }
    }
}
