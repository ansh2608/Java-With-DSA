public class Rat_in_DeadMaze_4_Direction {
    static void print(int sr,int sc,int er,int ec,String s,int[][] isDead){
        if (sr<0 || sc<0) return;
        if (sr>er || sc>ec) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if (isDead[sr][sc]==0) return;
        if (isDead[sr][sc]==-1) return;
        isDead[sr][sc]=-1;
        print(sr,sc+1,er,ec,s+"R",isDead);
        print(sr,sc-1,er,ec,s+"L",isDead);
        print(sr+1,sc,er,ec,s+"D",isDead);
        print(sr-1,sc,er,ec,s+"U",isDead);
        isDead[sr][sc]=1;
    }
    public static void main(String[] args) {
        int row=3,col=4;
        int[][] maze={  {1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}   };
        print(0,0,row-1,col-1,"",maze);
    }
}
