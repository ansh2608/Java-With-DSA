public class Problem_6 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1,k=0;i<=n;++i,k=0){
            for (int j=1;j<=n-1;++j){
                System.out.print(" ");
            }
            while(k!=2*i-1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
