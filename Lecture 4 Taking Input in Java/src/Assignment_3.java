import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int m=sc.nextInt();
        int total=p+c+m;
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+total/3+"%");
    }
}
