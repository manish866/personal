package DS;

public class Surrounded_Regions {
    public static void main(String[] args) {
        char board[][] = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("///////////////");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1)
                    dfs(i,j,board);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                    if(board[i][j]=='O')
                        board[i][j]='X';
                    else if(board[i][j]=='A')
                        board[i][j]='O';
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
    public static void dfs(int i,int j, char[][] board)
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O')
            return;

        board[i][j]='A';
        dfs(i+1,j,board);
        dfs(i-1,j,board);
        dfs(i,j+1,board);
        dfs(i,j-1,board);
    }
}
