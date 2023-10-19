public class Problem_9 {
    public static void main(String[] args) {
        int h=4,w=6;
        for (int i=1;i<=h;i++){
            for (int j=1;j<=w;j++){
                if (i==1 || i==h || j==1 || j==w){
                    System.out.print(j+" ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
