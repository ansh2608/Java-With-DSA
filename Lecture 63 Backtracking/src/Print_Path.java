public class Print_Path {
    static void print(int sr,int sc,int er,int ec,String s){
        if (sr>er || sc>ec) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        print(sr+1,sc,er,ec,s+"R");
        print(sr,sc+1,er,ec,s+"L");
    }
    public static void main(String[] args) {
        int r=3,c=3;
        print(1,1,r,c,"");
    }
}
