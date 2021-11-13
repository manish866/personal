package DS;

public class Unique_Paths_III {
    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        int zeros = 0;
        int sx = 0;
        int sy = 0;
        int total=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0)
                    zeros++;
                else if(grid[i][j]==1)
                {
                    sx = i;
                    sy = j;
                }
            }
        }
        total=dfs(grid,sx,sy,zeros);
        System.out.println(total);

    }
    public static int dfs(int[][] grid,int x,int y,int zeros)
    {
        if(x<0 || y<0 || x>=grid.length || y>= grid[0].length || grid[x][y]==-1)
            return 0;
        if(grid[x][y]==2)
            return zeros == -1 ? 1 : 0;
        grid[x][y] = -1;
        zeros--;
        int total = dfs(grid,x+1,y,zeros)+dfs(grid,x-1,y,zeros) + dfs(grid,x,y-1,zeros)+dfs(grid,x,y+1,zeros);
        grid[x][y] = 0;
        zeros++;
        return total;
    }
}
