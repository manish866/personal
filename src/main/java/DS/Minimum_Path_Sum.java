package DS;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int grid[][] = {{1,2},{1,1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sum+=grid[i][j];
            }
            break;
        }
        int sum1=0;
        for (int i = grid[0].length-1; i < grid[0].length; i++) {
            for (int j = 1; j < grid.length; j++) {
                sum1+=grid[j][i];
            }
            break;
        }
        System.out.println(sum+sum1);
    }
}
