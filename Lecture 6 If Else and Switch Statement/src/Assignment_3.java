import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sp= sc.nextInt();
        int cp= sc.nextInt();
        if (sp>cp) System.out.println("Profit: "+(sp-cp));
        else System.out.println("Loss: "+(cp-sp));
    }
}
