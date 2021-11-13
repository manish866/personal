package DS;

public class snake {
    int count=0;
    public static void main(String[] args) {
        int grid[][] = {{1,1,1,0,0,0},{1,1,0,0,0,0,},{0,0,0,1,0,1},{1,0,1,1,0,0},{0,0,0,0,0,0},{1,1,0,1,0,1}};
        int r=grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0) {
                   row(i,j,grid);


                }
            }
        }


    }
    public static int row (int i,int j,int grid[][])
    {
        if(i<0 || j<0 || i>grid.length || j>grid[0].length || grid[i][j]!=0)
            return 0;
        grid[i][j]=2;
        System.out.println(i+" "+j);
        row(i,j-1,grid);

        return 1;

    }
}
