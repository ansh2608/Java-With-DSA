import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int fac=1;
        for (int i=1;i<=N;i++){
            fac*=i;
        }
        System.out.println(fac);
    }
}
