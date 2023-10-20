import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int rem=1;
        while(n>0){
            int parity=n%2;
            ans += rem * parity;
            rem*=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
