public class Rat_in_a_DeadMaze {
    static void print(int sr,int sc,int er,int ec,String s,int[][] isDead){
        if (sr>er || sc>ec) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if (isDead[sr][sc]==0) return;
        isDead[sr][sc]=1;
        print(sr,sc+1,er,ec,s+"R",isDead);
        print(sr+1,sc,er,ec,s+"D",isDead);
    }
    public static void main(String[] args) {
        int row=4,col=6;
        int[][] isDead={{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
        print(0,0,row-1,col-1,"",isDead);
    }
}
