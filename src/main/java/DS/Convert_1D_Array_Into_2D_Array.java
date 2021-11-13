package DS;

public class Convert_1D_Array_Into_2D_Array {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m=2,n=2;
        int[][] done = new int[m][n];
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                done[i][j] = original[count++];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(done[i][j] + " ");
            }
            System.out.println();
        }
    }
}
