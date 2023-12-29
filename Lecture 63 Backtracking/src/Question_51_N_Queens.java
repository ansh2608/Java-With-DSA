import java.util.*;
public class Question_51_N_Queens {
    public static boolean isSafe(char[][] board,int row,int col){
        int n=board.length;
        for (int i=0;i<n;i++){
            if (board[row][i]=='Q') return false;
            if (board[i][col]=='Q') return false;
        }
        int i=row,j=col;
        while (i>=0 && j<n){
            if (board[i][j]=='Q') return false;
            i--;
            j++;
        }
        i=row;
        j=col;
        while (i<n && j<n){
            if (board[i][j]=='Q') return false;
            i++;
            j++;
        }
        i=row;
        j=col;
        while (i<n && j>=0){
            if (board[i][j]=='Q') return false;
            i++;
            j--;
        }
        i=row;
        j=col;
        while (i>=0 && j>=0){
            if (board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public static void nQueens(char[][] board,int row,List<List<String>> ans){
        int n=board.length;
        if (row==n){
            List<String> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                String str="";
                for (int j=0;j<n;j++){
                    str+=board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }
        for (int j=0;j<n;j++){
            if (isSafe(board,row,j)) {
                board[row][j]='Q';
                nQueens(board,row+1,ans);
                board[row][j]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) board[i][j]='.';
        }
        List<List<String>> ans=new ArrayList<>();
        nQueens(board,0,ans);
    }
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) board[i][j]='.';
        }
        nQueens(board,0);
    }
}
