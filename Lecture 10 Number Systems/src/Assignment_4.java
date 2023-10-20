import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=sc.nextInt();
        int ans=0,pw=1;
        while (b>0){
            int parity=b%10;
            ans+=pw*parity;
            pw*=2;
            b/=10;
        }
        System.out.println(d*ans);
    }
}
