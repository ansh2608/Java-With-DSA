public class Problem_12 {
    public static void main(String[] args) {
        int i,j,k;
        int rows=4;
        for(i = rows+1; i >1 ; i--) {
            for(j = i; j > 2; j--) {
                System.out.print(" ");
            }
            for( k=1;k<=(rows-i+1);k++){
                System.out.print(k);
            }
            for(int m=k;m>=1;m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
