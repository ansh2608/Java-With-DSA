import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f_name=sc.next();
        String l_name=sc.next();
        int roll=sc.nextInt();
        String sub=sc.next();
        System.out.println("Name: "+f_name+" "+l_name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Subject: "+sub);
    }
}
