package DS;


import java.util.ArrayList;
import java.util.List;

public class Word_Search {
    static int count=0;
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        char cword[] = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(cword[0]==board[i][j])
                {
                    boolean visited[][] = new boolean[board.length][board[0].length];
                    if(dfs(board,cword,i,j,visited,0))
                        System.out.println("true");

                }
            }
        }
    }
    public static boolean dfs(char[][] board,char[] word,int i,int j,boolean visited[][],int index)
    {
        if(index==word.length)
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j]==true)
            return false;
        if(board[i][j]!=word[index])
            return false;
        visited[i][j]=true;
        if(dfs(board,word,i+1,j,visited,index+1) || dfs(board,word,i-1,j,visited,index+1) || dfs(board,word,i,j+1,visited,index+1)
        || dfs(board,word,i,j-1,visited,index+1))
            return true;
        visited[i][j]=true;
        return false;

    }

}
