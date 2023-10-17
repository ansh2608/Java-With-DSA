import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (x<0) System.out.println("Negative skipped");
        else System.out.println(x);
    }
}
