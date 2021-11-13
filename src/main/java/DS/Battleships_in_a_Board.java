package DS;

public class Battleships_in_a_Board {
    public static void main(String[] args) {
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'},{'.','.','.','.'}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        int nox = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]=='X')
                    nox+=neigbhour(board,i,j);
            }
        }
        System.out.println(nox);
    }
    public static int neigbhour(char board[][], int i, int j)
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='X')
            return 0;
        board[i][j]='Y';
        neigbhour(board,i+1,j);
        neigbhour(board,i-1,j);
        neigbhour(board,i,j+1);
        neigbhour(board,i,j-1);
        return 1;
    }
}
