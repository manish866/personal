package DS;

public class Rotting_Oranges {
    static int count = 0;
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==2)
                {
                    dfs(i,j,grid);
                }
            }
        }
        System.out.println(count);
    }
    public static void  dfs(int i, int j, int[][] grid)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1)
            return;
        count++;
        grid[i][j]=2;
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
}
