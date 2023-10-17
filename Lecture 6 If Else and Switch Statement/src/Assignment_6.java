import java.util.Scanner;

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if (marks<=100 && marks>90) System.out.println("A+");
        else if (marks<=90 && marks>80) System.out.println("A");
        else if (marks<=80 && marks>70) System.out.println("B+");
        else if (marks<=70 && marks>60) System.out.println("B");
        else if (marks<=60 && marks>50) System.out.println("C");
        else if (marks<=50 && marks>40) System.out.println("D");
        else if (marks<=40 && marks>30) System.out.println("E");
        else if (marks<=30 && marks>0) System.out.println("F");
        else System.out.println("INVALID");
    }
}
