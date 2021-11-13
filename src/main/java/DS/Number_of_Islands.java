package DS;

public class Number_of_Islands {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0',0}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        int noi = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j]=='1')
                {
                    noi+=neighbor(grid,i,j);
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(noi);
    }
    public static int neighbor(char[][] grid, int i, int j)
    {
        if(i<0 || j<0 || i>grid.length || j>grid[0].length || grid[i][j]!='1')
            return 0;
        grid[i][j]='2';
        neighbor(grid,i+1,j);
        neighbor(grid,i-1,j);
        neighbor(grid,i,j+1);
        neighbor(grid,i,j-1);

        return 1;
    }
}
