public class Problem_7 {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<n+1;i++){
            for (int j=i;j<n+1;j++){
                System.out.print(j+" ");
            }
            for (int k=1;k<i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
