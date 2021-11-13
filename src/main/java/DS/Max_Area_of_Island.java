package DS;

public class Max_Area_of_Island {
    static  int total = 0,max=0;
    public static void main(String[] args) {
       // int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int[][] grid = {{0,0,0,0,0,0,0,0}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1) {
                    neighour(grid, i, j);
                    max=Math.max(total,max);
                    total=0;
                }
            }
        }
        System.out.println(max);
    }
    public static int neighour(int[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1)
            return 0;
        grid[i][j] = 2;
        total+=1;

        neighour(grid,i+1,j);
        neighour(grid,i-1,j);
        neighour(grid,i,j+1);
        neighour(grid,i,j-1);
        return 1;

    }
}
