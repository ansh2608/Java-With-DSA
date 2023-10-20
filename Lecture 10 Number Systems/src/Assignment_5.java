import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int pw=1;
        while(n>0){
            int parity=n%2;
            ans+=pw*parity;
            pw*=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
