public class Problem_13 {
    public static void main(String[] args) {
        int rows=4;
        int i,j,k;
        for(i = rows+1; i >1 ; i--)
        {
            for(j = i; j > 2; j--)
            {
                System.out.print(" ");
            }
            for( k=1;k<=(rows-i+1);k++){
                if(k==1){ System.out.print(rows-i+2);}
                else{ System.out.print(" ");}
            }
            for(int m=k;m>=1;m--){
                if(m==1){ System.out.print(rows-i+2);}
                else{ System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
