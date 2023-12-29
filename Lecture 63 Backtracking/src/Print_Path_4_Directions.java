public class Print_Path_4_Directions {
    static void print(int sr,int sc,int er,int ec,String s,boolean[][] isVisited){
        if (sr<0 || sc<0) return;
        if (sr>er || sc>ec) return;
        if (isVisited[sr][sc]) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        print(sr,sc+1,er,ec,s+"R",isVisited);
        print(sr+1,sc,er,ec,s+"D",isVisited);
        print(sr,sc-1,er,ec,s+"L",isVisited);
        print(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc]=false;
    }
    public static void main(String[] args) {
        int r=3,col=3;
        boolean[][] isVisited=new boolean[r][col];
        print(0,0,r-1,col-1,"",isVisited);
    }
}
