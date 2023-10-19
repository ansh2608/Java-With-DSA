public class Problem_3 {
    public static void main(String[] args) {
        int h=4,w=6;
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (j%2==0) System.out.print(".");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
